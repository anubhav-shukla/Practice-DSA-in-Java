package DSA;

import java.math.BigInteger;
import java.util.Vector;

public class FindMissingAndRepeating2 {
	static Vector<Integer> repeatedNumber(int[] a) 
    {
       
        BigInteger n=BigInteger.valueOf(a.length);
  
        BigInteger s=BigInteger.valueOf(0);
        BigInteger ss=BigInteger.valueOf(0);

        for(int x : a)
        {
            s=  s.add(BigInteger.valueOf(x));
            ss= ss.add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(x))); 
        }

        BigInteger as= n.multiply(n.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
        BigInteger ass= as.multiply(BigInteger.valueOf(2).multiply(n).add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(3));

        BigInteger sub=as.subtract(s);
        BigInteger add=(ass.subtract(ss)).divide(sub);
        //(ass-ss)/sub;

        int b = sub.add(add).divide(BigInteger.valueOf(2)).intValue();
        //(sub+add)/2;
        int A = BigInteger.valueOf(b).subtract(sub).intValue();
        Vector<Integer> ans = new Vector<>();
        ans.add(A);
        ans.add(b);
        return ans;
    }

    // Driver Code
    public static void main(String[] args) 
    {
        int[] v = { 4, 3, 6, 2, 1, 6, 7 };
        Vector<Integer> res = repeatedNumber(v);
        for (int x : res) 
        {
            System.out.print(x + " ");
        }
    }

}
