package DSA;

import java.util.Arrays;

public class Reachagivenscore {
	public static long count(int n) {
		long[] dp = new long[(int)n+1];
		Arrays.fill(dp, 0);
		dp[0] = 1;

		

		for(int i=3;i<=n;++i){
		dp[i]+=dp[i-3];
		}

		for(int i=5;i<=n;++i){
		dp[i]+=dp[i-5];
		}

		for(int i=10;i<=n;++i){
		dp[i]+=dp[i-10];
		}

		return dp[n];
		}
		public static void main (String ar[]) {
			System.out.println(count(13));
		}
}
