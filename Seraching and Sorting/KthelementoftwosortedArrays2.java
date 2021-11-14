package DSA;

import java.util.PriorityQueue;

public class KthelementoftwosortedArrays2 {
	   static int kth(int a[], int b[], 
               int n, int m, int k)
{
    
    // Declaring a min heap
    PriorityQueue<Integer> pq = 
                    new PriorityQueue<>();

    // Pushing elements for 
    // array a to min-heap
    for (int i = 0; i < n; i++) {
        pq.offer(a[i]);
    }

    // Pushing elements for 
    // array b to min-heap
    for (int i = 0; i < m; i++) {
        pq.offer(b[i]);
    }

    // Poping-out K-1 elements
    while (k-- > 1) {
        pq.remove();
    }
    return pq.peek();
}

// Driver Code
public static void main(String[] args)
{
    int arr1[] = { 2, 3, 6, 7, 9 };
    int arr2[] = { 1, 4, 8, 10 };
    int k = 5;
    System.out.print(kth(arr1, arr2, 5, 4, k));
}
}
