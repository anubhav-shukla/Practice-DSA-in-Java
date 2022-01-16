package DSA;

public class BBTcounter {
static final int MOD = 1000000007;
    
    public static long countBT(int h) {
        long[] dp = new long[h + 1];
        
        // base cases
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= h; ++i) 
            dp[i] = (dp[i - 1] * ((2 * dp [i - 2])% MOD + dp[i - 1]) % MOD) % MOD;
            
            return dp[h];
    }
    
    // Driver program
    public static void main (String[] args) {
        int h = 3; 
        System.out.println("No. of balanced binary trees of height "+h+" is: "+countBT(h)); 
    }

}
