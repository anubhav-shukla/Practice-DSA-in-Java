package DSA;

public class Smallestsumcontiguoussubarray {
	   static int smallestSumSubarr(int arr[], int n)
	    {

	        int min_ending_here = 2147483647;
	         
	        int min_so_far = 2147483647;
	         
	        for (int i = 0; i < n; i++)
	        {
	             
	            if (min_ending_here > 0)
	                min_ending_here = arr[i];
	             
	            else
	                min_ending_here += arr[i];
	             
	            min_so_far = Math.min(min_so_far,
	                                   min_ending_here);        
	        }
	         
	        return min_so_far;
	    }
	     
	    public static void main(String[] args)
	    {
	         
	        int arr[] = {3, -4, 2, -3, -1, 7, -5};
	        int n = arr.length;
	         
	        System.out.print("Smallest sum: "
	                + smallestSumSubarr(arr, n));
	    }
	
}
