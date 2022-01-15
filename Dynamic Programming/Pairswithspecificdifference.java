package DSA;

import java.util.Arrays;

public class Pairswithspecificdifference {
	public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        // Your code goes here 
        Arrays.sort(arr);
        int maxsum = 0;
        int i = N-1;
        while(i > 0){
            int j = i-1;
            if(arr[i] - arr[j] < K) { 
                maxsum += arr[i] + arr[j];
                i = j - 1; 
            }
            else{
                i = j;
            }
        }
        return maxsum;
    
    }
    
public static void main(String ar[]) {
int	arr[] = {3, 5, 10, 15, 17, 12, 9};
	int K = 4;
	int n=7;
	System.out.println(maxSumPairWithDifferenceLessThanK(arr,n,K));
}
}
