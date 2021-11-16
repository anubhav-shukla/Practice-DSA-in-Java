package DSA;

public class Smallestfactorialnumber {
	  static boolean check(int p, int n)
	    {
	        int temp = p, count = 0, f = 5;
	        while (f <= temp)
	        {
	            count += temp / f;
	            f = f * 5;
	        }
	        return (count >= n);
	    }
	     
	    static int findNum(int n)
	    {
	        if (n==1)
	            return 5;
	     
	        int low = 0;
	        int high = 5 * n;
	     
	        while (low < high)
	        {
	            int mid = (low + high) >> 1;
	     
	            if (check(mid, n))
	                high = mid;
	            else
	                low = mid + 1;
	        }
	     
	        return low;
	    }
	    
	    public static void main (String[] args)
	    {
	        int n = 6;
	        System.out.println(findNum(n));
	    }
	
}
