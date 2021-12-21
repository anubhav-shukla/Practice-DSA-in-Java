package DSA;

public class Allocateminimumnumberofpages2 {
	  static boolean isPossible(int arr[], int n, int m, int curr_min)
	    {
	        int studentsRequired = 1;
	        int curr_sum = 0;
	     
	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] > curr_min)
	                return false;
	     
	            if (curr_sum + arr[i] > curr_min)
	            {
	                studentsRequired++;
	     
	                curr_sum = arr[i];
	     
	                if (studentsRequired > m)
	                    return false;
	            }
	     
	            else
	                curr_sum += arr[i];
	        }
	        return true;
	    }
	     
	    static int findPages(int arr[], int n, int m)
	    {
	        long sum = 0;

	        if (n < m)
	            return -1;
	     
	        for (int i = 0; i < n; i++)
	            sum += arr[i];
	     
	        int start = 0, end = (int) sum;
	        int result = Integer.MAX_VALUE;
	     
	        while (start <= end)
	        {
	            int mid = (start + end) / 2;
	            if (isPossible(arr, n, m, mid))
	            {
	                result = mid;
	     
	                end = mid - 1;
	            }
	     
	            else
	                start = mid + 1;
	        }
	     
	        return result;
	    }
	    
	    public static void main(String[] args)
	    {
	        int arr[] = {12, 34, 67, 90};
	       
	        int m = 2; //No. of students
	     
	        System.out.println("Minimum number of pages = " +
	                          findPages(arr, arr.length, m));
	    }
	
}
