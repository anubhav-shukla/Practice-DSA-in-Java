package DSA;
import java.io.*;
import java.util.*;
public class FriendsPairingProblem {


	  static int mod = (int)1e9 + 7;
	  public static long countFriendsPairings(int n, long[] dp) {
	    if (n == 0) {
	      return dp[n] = 1;
	    }

	    if (dp[n] != -1) {
	      return dp[n];
	    }
	    long single = countFriendsPairings(n - 1, dp);
	    long pair = n - 2 >= 0 ? countFriendsPairings(n - 2, dp) * (n-1) : 0;

	    return dp[n] = (single + pair % mod) % mod;
	  }
	  
	  public static long countFriendsPairings(int n) {
	    long[] dp = new long[n+1];
	    Arrays.fill(dp,-1);
	    return countFriendsPairings(n,dp);
	  }
	  public static void main(String ar[]) {
		  System.out.println(countFriendsPairings(3));
	  }
	
}
