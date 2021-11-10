package DSA;

import java.util.Arrays;

public class MajorityElement2 {
	public static int majorityElement(int[] arr, int n)
	{
	    
	    Arrays.sort(arr);

	    int count = 1, max_ele = -1, 
	         temp = arr[0], ele = 0,
	            f = 0;

	    for(int i = 1; i < n; i++)
	    {
	        
	        if (temp == arr[i])
	        {
	            count++;
	        }
	        else 
	        {
	            count = 1;
	            temp = arr[i];
	        }

	       
	        if (max_ele < count) 
	        {
	            max_ele = count;
	            ele = arr[i];

	            if (max_ele > (n / 2)) 
	            {
	                f = 1;
	                break;
	            }
	        }
	    }

	    return (f == 1 ? ele : -1);
	}

	public static void main(String[] args)
	{
	    int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
	    int n = 7;

	    System.out.println(majorityElement(arr, n));
	}
	
}
