package DSA;
import java.util.*;
public class SpaceOptimizedSolutionofLCS {
	public static int lcs(String X, String Y)
    {
		int m = X.length(), n = Y.length();

int L[][] = new int[2][n+1];

int bi=0;

for (int i = 0; i <= m; i++)
{
   
  bi = i & 1;

  for (int j = 0; j <= n; j++)
  {
      if (i == 0 || j == 0)
          L[bi][j] = 0;

      else if (X.charAt(i - 1) ==
               Y.charAt(j - 1))
          L[bi][j] = L[1 - bi][j - 1] + 1;

      else
          L[bi][j] = Math.max(L[1 - bi][j],
                              L[bi][j - 1]);
  }
}

return L[bi][n];
}


public static void main(String[] args)
{
String X = "AGGTAB";
String Y = "GXTXAYB";

System.out.println("Length of LCS is " +
                          lcs(X, Y));
}
}
