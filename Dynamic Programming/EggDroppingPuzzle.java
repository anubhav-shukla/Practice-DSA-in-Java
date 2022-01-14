package DSA;

import java.util.Arrays;

public class EggDroppingPuzzle {

	   static int eggDrop(int n, int k) 
		{
		    int dp[][]=new int[n+1][k+1];
		    for(int i=1;i<=n;i++)
		    {
		        for(int j=1;j<=k;j++)
		        {
		            if(i==1)
		            {
		                dp[i][j]=j;
		            }
		            else if(j==1)
		            {
		                dp[i][j]=1;
		            }
		            else
		            {
		                int min=Integer.MAX_VALUE;
		                for(int u=0,l=j-1;l>=0;l--,u++)
		                {
		                    int max=Math.max(dp[i-1][u],dp[i][l]);
		                    min=Math.min(max,min);
		                }
		                dp[i][j]=min+1;
		            }
		        }
		    }
		    return dp[n][k];
		
		}
	   public static void main(String ar[]) {
		   System.out.println(eggDrop(2,10));
	   }
	
}
