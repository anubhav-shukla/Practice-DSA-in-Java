package DSA;

import java.util.Arrays;

public class LongestRepeatingSubsequence2 {
	static int lrs(StringBuilder s1, int i, int j, int[][] dp)
	  {
	    if(i >= s1.length() || j >= s1.length())
	    {
	      return 0;
	    }

	    if(dp[i][j] != -1)
	    {
	      return dp[i][j];
	    }

	    if(dp[i][j] == -1)
	    {
	      if(s1.charAt(i) == s1.charAt(j) && i != j)
	      {
	        dp[i][j] = 1 + lrs(s1, i + 1, j + 1, dp);
	      }
	      else
	      {
	        dp[i][j] = Math.max(lrs(s1, i, j + 1, dp), lrs(s1, i + 1, j, dp));
	      }
	    }
	    return dp[i][j];

	  }

	  // Driver code
	  public static void main (String[] args) 
	  {    
	    String s1 = "aabb";   
	    StringBuilder input1 = new StringBuilder();

	    // append a string into StringBuilder input1
	    input1.append(s1);

	    // reverse StringBuilder input1
	    input1.reverse();
	    int[][] dp = new int[1000][1000];
	    for(int[] row : dp)
	    {
	      Arrays.fill(row, -1);
	    }
	    System.out.println("LENGTH OF LONGEST REPEATING SUBSEQUENCE IS :" +
	                       lrs(input1, 0, 0, dp));
	  }
	
}
