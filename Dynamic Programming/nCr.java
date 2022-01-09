package DSA;
import java.util.*;
public class nCr {
	static int nCr(int n, int r){
        if(r>n)return 0;
        if((n-r) < r) r = n-r;
        int mod  = 1000000007;
        
        int[] dp = new int[r+1];
        
        Arrays.fill(dp,0);
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=(Math.min(r,i));j>0;j--){
                dp[j] = (dp[j] + dp[j-1])%mod;
            }
        }
        
        return dp[r];
    }
public static void main(String ar[]) {
	int n = 2, r = 4;
	System.out.println(nCr(n,r));
}
}
