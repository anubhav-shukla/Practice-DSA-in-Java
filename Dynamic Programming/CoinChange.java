package DSA;

public class CoinChange {
	public static long count(int arr[], int n, int w) {
     
        long[][] dp=new long[n+1][w+1];
        for(int i=0;i<=n;i++)
            dp[i][0]=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=w;j++) {
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i][j-arr[i-1]]+dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][w];
    }
public static void main(String arg[]) {
 int	n = 4 , m = 3;
			int S[] ={1,2,3,4};
			System.out.println(count(S,n,m));
}
}
