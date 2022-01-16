package DSA;

public class KnapsacwithDuplicateItems {
	 static int knapSack(int n, int w, int val[], int wt[])
	    {
	        // code here
	        int[][] dp=new int[n+1][w+1];
	        for(int i=1;i<=n;i++) {
	            for(int j=1;j<=w;j++) {
	                if(wt[i-1]<=j)
	                    dp[i][j]=Math.max(dp[i][j-wt[i-1]]+val[i-1],dp[i-1][j]);
	                else
	                    dp[i][j]=dp[i-1][j];
	            }
	        }
	        return dp[n][w];
	    }
	 public static void main(String ar[]) {
		int N = 4, W = 8;
				 int val[] = {1, 4, 5, 7};
				 int wt[] = {1, 3, 4, 5};
		 System.out.println(knapSack(N,W,val,wt));
	 }
}
