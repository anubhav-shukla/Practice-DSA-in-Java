package DSA;

public class PaintingtheFence {
	 static long countWays(int n,int k)
	    {
	        if(n==1) return k;
	        
	        long dp[][] = new long[n+1][2];
	        dp[2][0] = k%1000000007;
	        dp[2][1] = (k*(k-1))%1000000007;
	        for(int i=3; i<=n; i++){
	            // Painting with same color.
	            dp[i][0] = dp[i-1][1]%1000000007;
	            // Patining with different color.
	            dp[i][1] = ((dp[i-1][0] + dp[i-1][1])*(k-1))%1000000007;
	        }
	        
	        return (dp[n][0] + dp[n][1])%1000000007;
	}
public static void main(String ar[]) {
	System.out.println(countWays(2,4));
}
}
