package DSA;

public class Maximumsumincreasingsubsequence {
	public static int maxSumIS(int arr[], int n)  
	{  
	    int dp[]=new int[n];
	    
	    dp[0]=arr[0];
	    int res=arr[0];
	    for(int i=1;i<n;i++)
	    {
	        int maxSum=Integer.MIN_VALUE;
	        for(int j=0;j<i;j++)
	        {
	            if(arr[j]<arr[i])
	            {
	                maxSum=Math.max(maxSum,dp[j]);
	            }
	        }
	        
	        if(maxSum!=Integer.MIN_VALUE)
	            dp[i]=arr[i]+maxSum;
	        else
	            dp[i]=arr[i];
	            
	        res=Math.max(res,dp[i]);     
	    }
	    return res;
	} 
public static void main(String ar[]) {
	int a[]= {1,2,3};
	int n=3;
	System.out.println(maxSumIS(a,n));
}
}
