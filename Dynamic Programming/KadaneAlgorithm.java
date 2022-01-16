package DSA;

public class KadaneAlgorithm {
	 static long maxSubarraySum(int arr[], int n){
	      

	       int sum = arr[0];
	       int max_sum = sum;
	       for(int i = 1; i < n ;i++){
	          sum = arr[i] + sum > arr[i] ? arr[i] + sum : arr[i];
	          if(sum > max_sum) max_sum = sum;
	          }
	        return max_sum;

	    }
	 public static void main(String ar[]) {
		int  N = 5;
		int Arr[] = {1,2,3,-2,5};
		 System.out.println(maxSubarraySum(Arr,N));
	 }
}
