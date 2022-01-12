package DSA;

public class MaximizeTheCutSegments {
	 public static int maximizeCuts(int n, int x, int y, int z)
	    {
	        int w=n; n=3;
	        int[] arr=new int[3];
	            arr[0]=x;arr[1]=y;arr[2]=z;
	        int[][] dp=new int[n+1][w+1];
	        for(int j=1;j<=w;j++)
	            dp[0][j]=Integer.MIN_VALUE;
	        for(int i=1;i<=n;i++) {
	            for(int j=1;j<=w;j++) {
	                if(arr[i-1]<=j)
	                    dp[i][j]=Math.max(dp[i][j-arr[i-1]]+1,dp[i-1][j]);
	                else
	                    dp[i][j]=dp[i-1][j];
	            }
	        }
	        return (dp[n][w]<0)?0:dp[n][w];
	    }
	public static void main(String ar[]) {
	int	N = 5;
int	x = 5, y = 3, z = 2;

		System.out.println(maximizeCuts(N,x,y,z));
	}
}
