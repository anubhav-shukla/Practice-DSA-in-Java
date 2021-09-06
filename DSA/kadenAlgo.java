package DSA;

public class kadenAlgo {
	 static int maxSubArraySum(int a[])
	    {
	        int size = a.length;
	        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
	 
	        for (int i = 0; i < size; i++)
	        {
	            max_ending_here = max_ending_here + a[i];
	            if (max_so_far < max_ending_here)
	                max_so_far = max_ending_here;
	            if (max_ending_here < 0)
	                max_ending_here = 0;
	        }
	        System.out.println(max_so_far);
	        return max_so_far;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ar[]= {1,2,3,4,-8,2,-9,4};
       maxSubArraySum(ar);
	}
}
