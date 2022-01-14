package DSA;

import java.util.ArrayList;

public class CountallsubsequenceshavingproductlessthanK {
	public static int productSubSeqCount(ArrayList<Integer> arr,
            int k)
{
int n = arr.size();
int dp[][]=new int[k + 1][n + 1];

for (int i = 1; i <= k; i++) {
for (int j = 1; j <= n; j++) {

dp[i][j] = dp[i][j - 1];

if (arr.get(j-1) <= i && arr.get(j-1) > 0)

dp[i][j] += dp[i/arr.get(j - 1)][j - 1] + 1;
}
}
return dp[k][n];
}

public static void main(String args[])
{
ArrayList<Integer> A = new ArrayList<Integer>();
A.add(1);
A.add(2);
A.add(3);
A.add(4);
int k = 10;
System.out.println(productSubSeqCount(A, k));
}

}
