package DSA;

public class PartitionEqualSubsetSum {
	 static boolean isSubsetSum(int arr[], int n, int sum)
	    {
	        boolean subset[][] = new boolean[2][sum + 1];
	     
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= sum; j++) {
	     
	                if (j == 0)
	                    subset[i % 2][j] = true; 
	     
	                else if (i == 0)
	                    subset[i % 2][j] = false; 
	                else if (arr[i - 1] <= j)
	                    subset[i % 2][j] = subset[(i + 1) % 2]
	                 [j - arr[i - 1]] || subset[(i + 1) % 2][j];
	                else
	                    subset[i % 2][j] = subset[(i + 1) % 2][j];
	            }
	        }
	     
	        return subset[n % 2][sum];
	    }
	     
	    // Driver code
	    public static void main(String args[])
	    {
	        int arr[] = { 1, 2, 5 };
	        int sum = 7;
	        int n = arr.length;
	        if (isSubsetSum(arr, n, sum) == true)
	            System.out.println("There exists a subset with" + 
	                                              "given sum");
	        else
	            System.out.println("No subset exists with" + 
	                                           "given sum");
	    }
	
}
