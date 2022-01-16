package DSA;

public class OptimalStrategyForAGame {
	static long countMaximum(int arr[], int n)
    {
        int dp[][] = new int[n][n];
        for(int g=0;g<n;g++) {
            for(int i=0,j=g;j<n;j++,i++) {
                if(g==0) {
                    dp[i][j] = 0;
                }
                else if( g%2!=0) {
                    dp[i][j] = Math.max(dp[i][j-1]+arr[j],dp[i+1][j]+arr[i]);
                }
                else
                dp[i][j] = Math.min(dp[i][j-1],dp[i+1][j]);
            }
        }
        return dp[0][n-1];
    }
	public static void main(String ar[]) {
		int N = 4;
				int A[] = {8,15,3,7};
		System.out.println(countMaximum(A,N));
	}
}
