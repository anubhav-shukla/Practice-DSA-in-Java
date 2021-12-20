package DSA;

public class efficientlyimplementkQueues {
    int k;
    int n;
    int[] arr;
    int[] front;
    int[] rear;
    int[] next;
    int free;
     
    efficientlyimplementkQueues(int k, int n){
         
        this.k = k;
        this.n = n;
        this.arr = new int[n];
        this.front = new int[k];
        this.rear = new int[k];
        this.next = new int[n];
        for(int i= 0; i< k; i++) {
            front[i] = rear[i] = -1;
        }
        free = 0;
        for(int i= 0; i< n-1; i++) {
            next[i] = i+1;
        }
        next[n-1] = -1;
         
         
    }
     
    public static void main(String[] args)
    {
        int k = 3, n = 10;
        efficientlyimplementkQueues ks=  new efficientlyimplementkQueues(k, n);
        
        ks.enqueue(15, 2);
        ks.enqueue(45, 2);
       
        ks.enqueue(17, 1);
        ks.enqueue(49, 1);
        ks.enqueue(39, 1);
       
        ks.enqueue(11, 0);
        ks.enqueue(9, 0);
        ks.enqueue(7, 0);
         
        System.out.println("Dequeued element from queue 2 is " +
                                ks.dequeue(2));
        System.out.println("Dequeued element from queue 1 is " +
                                ks.dequeue(1));
        System.out.println("Dequeued element from queue 0 is " +
                                ks.dequeue(0) );
       
    }
     
    private boolean isEmpty(int i) {
        return front[i] == -1;
    }
     
    private boolean isFull(int i) {
        return free == -1;
    }
 
    private void enqueue(int item, int j) {
        if(isFull(j)) {
            System.out.println("queue overflow");
            return;
        }
         
        int nextFree = next[free];
         
        if(isEmpty(j)) {
            rear[j] = front[j] = free;
        }else {
            next[rear[j]] = free;
            rear[j] = free;
        }
        next[free] = -1;
         
        arr[free] = item;
         
        free = nextFree;
    }
     
    private int dequeue(int i) {
        if(isEmpty(i)) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
         
        int frontIndex = front[i];
 
        front[i] = next[frontIndex];
         
        next[frontIndex] = free;
        free = frontIndex;
         
        return arr[frontIndex];
    }
     
}
