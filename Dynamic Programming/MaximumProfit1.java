package DSA;

public class MaximumProfit1 {
	   static int maxProfit(int k, int n, int A[]) {
	     
	       int dp[][]=new int[k+1][n];
	       int max_so=Integer.MIN_VALUE;
	       for(int i=1;i<=k;i++)
	       {
	           max_so=Integer.MIN_VALUE;
	           for(int j=1;j<n;j++)
	           {
	               max_so=Math.max(max_so,dp[i-1][j-1]-A[j-1]);
	               dp[i][j]=Math.max(dp[i][j-1],max_so+A[j]);
	           }
	       }
	       return dp[k][n-1];
	   }
	public static void main(String ar[]) {
		int K = 3, N = 4;
				int A[] = {20, 580, 420, 900};
		System.out.println(maxProfit(K,N,A));
	}
}
