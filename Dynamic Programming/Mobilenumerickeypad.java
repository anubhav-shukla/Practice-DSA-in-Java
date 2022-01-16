package DSA;

public class Mobilenumerickeypad {
	 public static long solve(String []arr, int n){
			if( n == 0 ) return 0;
			if( n == 1 ) return 10;
			
			long dp[][] = new long[2][10];
			
			for(int i = 0 ; i < 10 ; i++)
				dp[1][i] = 1;
			
			for(int i = 0 ; i < 10; i ++)
				dp[2&1][i] = arr[i].length();
			
			
			for(int i = 3 ; i <= n; i ++){

				for(int j = 0 ; j < 10 ; j++){
					int len = arr[j].length();
					long sum = 0;
					for(int k = 0 ; k < len ; k ++){
						int number = arr[j].charAt(k)-'0';
						sum += dp[(i-1)&1][number];
					}
					dp[i&1][j] = sum;
				}
			}
			
			long result = 0;
			for(int i = 0 ; i < 10 ; i ++){
				result += dp[n&1][i];
			}
			
			return result;
		}
		
		
		public static long getCount(int N){
			String arr[] = new String[]{"08", 
						"124", "1235", "236",
						"1457", "24568", "3569",
						"478", "57890", "689"};
			return solve(arr, N);
		}
	public static void main(String ar[]) {
		System.out.println(getCount(2));
	}
}
