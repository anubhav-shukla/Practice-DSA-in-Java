package DSA;

public class LongestcommonSubsequence {
	static int lcs(int x, int y, String s1, String s2)
	   {
	       int[][] b = new int[y+1][x+1];
	       for(int i = 0;i<y+1;i++)
	       for(int j = 0;j<x+1;j++){
	           if(i==0||j==0) b[i][j] = 0;
	           else if(s2.charAt(i-1) == s1.charAt(j-1)) b[i][j] = b[i-1][j-1] + 1;
	           else b[i][j] = Math.max(b[i-1][j],b[i][j-1]);
	       }
	       return b[y][x];
	   }
	   

	public static void main(String ar[]) {
	int	A = 3, B = 2;
		String		str1 = "ABC";
		String		str2 = "AC";
		System.out.println(lcs(A,B,str1,str2));
	}
}
