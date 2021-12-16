package DSA;

public class efficientlyimplementkstacks {
	static class KStack 
    {
        int arr[];  
        int top[];  
        int next[];
        int n, k;
        int free; 
        KStack(int k1, int n1) 
        {
            k = k1;
            n = n1;
            arr = new int[n];
            top = new int[k];
            next = new int[n];
  
            for (int i = 0; i < k; i++)
                top[i] = -1;
  
            free = 0;
            for (int i = 0; i < n - 1; i++)
                next[i] = i + 1;
            next[n - 1] = -1; // -1 is used to indicate end of free list
        }
        boolean isFull() 
        {
            return (free == -1);
        }
        void push(int item, int sn) 
        {   if (isFull()) 
            {
                System.out.println("Stack Overflow");
                return;
            }
  
            int i = free; // Store index of first free slot
            free = next[i];
  
            next[i] = top[sn];
            top[sn] = i;
  
            arr[i] = item;
        }
        int pop(int sn) 
        {
            if (isEmpty(sn)) 
            {
                System.out.println("Stack Underflow");
                return Integer.MAX_VALUE;
            }
  
            int i = top[sn];
  
            top[sn] = next[i]; 
            next[i] = free;
            free = i;
  
            return arr[i];
        }
  
        boolean isEmpty(int sn) 
        {
            return (top[sn] == -1);
        }
  
    }
  
    public static void main(String[] args) 
    {
        int k = 3, n = 10;
          
        KStack ks = new KStack(k, n);
  
        ks.push(15, 2);
        ks.push(45, 2);
  
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
  
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);
  
        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }

}
