package DSA;

import java.io.IOException;

public class Productarraypuzzle {
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long res[] = new long[n];
long msi = nums[0];

res[0] =1;
for(int i =1 ; i<n ; i++)
{
res[i] = msi;
msi= msi*nums[i];
}

msi= nums[n-1];
for(int i=n-2 ; i>=0; i--)
{
res[i]= res[i]*msi;
msi= msi*nums[i];
}
return res;
}
	   public static void main(String args[])
		        throws IOException
		    {
		        int n = 5;
		        int[] array = { 10, 3, 5, 6, 2 };

		        Productarraypuzzle2 ob = new Productarraypuzzle2();
		        long[] ans = new long[n];
		        ans = ob.productExceptSelf(array, n);

		        for (int i = 0; i < n; i++) {
		            System.out.print(ans[i] + " ");
		        }
		    }


}
