package DSA;

public class Maximumpathsuminmatrix {
	 static int maximumPath(int n, int matrix[][])
	    {
	        int[][] dp = new int[n][n];
	        for(int i = n - 1; i >= 0; i --) {
	            for(int j = n - 1; j >= 0; j--) {
	                if(i == n - 1) {
	                    dp[i][j] = matrix[i][j];
	                } else if(j == 0) {
	                    dp[i][j] = matrix[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
	                } else if(j == n - 1) {
	                    dp[i][j] = matrix[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j - 1]);
	                } else {
	                    dp[i][j] = matrix[i][j] + Math.max(dp[i + 1][j], Math.max(dp[i + 1][j + 1], dp[i + 1][j - 1]));
	                }
	            }
	        }
	        int res = dp[0][0];
	        for(int j = 1; j < n; j++) {
	            res = Math.max(res, dp[0][j]);
	        }
	        return res;
	}
	 public static void main(String ar[]) {
		int N = 2;
				 int Matrix[][] = {{2, 2},{2, 2}};
		 System.out.println(maximumPath(N,Matrix));
	 }
}
