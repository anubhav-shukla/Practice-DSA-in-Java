package DSA;

public class CountDerangements {
	 static int countDer(int n)
	    {
	        if (n == 1) return 0;
	        if (n == 2) return 1;
	        
	        return (n - 1) * (countDer(n - 1) + 
	                          countDer(n - 2));
	    }
	    
	    public static void main (String[] args)
	    {
	        int n = 4;
	        System.out.println( "Count of Derangements is "
	                             +countDer(n));

	    }
	
}
