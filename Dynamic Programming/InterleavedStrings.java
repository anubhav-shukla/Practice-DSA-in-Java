package DSA;

public class InterleavedStrings {

		   
		public static boolean isInterLeave(String a,String b,String c)
		{
		           //Your code here
		      int m = a.length()+1;
		       int n = b.length()+1;
		       boolean[][] dp = new boolean[m][n];
		       dp[m-1][n-1]=true;
		       for(int i=m-1; i>=0; i--) {
		           for(int j=n-1; j >= 0; j--) {
		               if(i < a.length() && a.charAt(i) == c.charAt(i+j) && dp[i+1][j]) {
		                   dp[i][j]=true;
		               }
		               if(j < b.length() && b.charAt(j) == c.charAt(i+j) && dp[i][j+1]) {
		                   dp[i][j]=true;
		               }
		           }
		       }
		       return dp[0][0];
		}
	
	public static void main(String ar[]) {
		String A = "XY", B = "X", C = "XXY";
		System.out.println(isInterLeave(A,B,C));
	}
}
