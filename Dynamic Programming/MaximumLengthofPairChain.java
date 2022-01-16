package DSA;

import java.util.Scanner;

public class MaximumLengthofPairChain {
	 public static int MaxChainLen(int array[][], int n)
	    {
	       int i, j, maximum_len = 0;
	       int length_array[] = new int[n];
	    
	       for ( i = 0; i < n; i++ )
	       {
	          length_array[i] = 1;
	       }
	      
	       for(i = 1; i < n; i++ ){
	          for(j = 0; j < i; j++ )
	          {
	             if((array[i][0] > array[j][1]) && (length_array[i] < (length_array[j] + 1)))
	             {
	                length_array[i] = length_array[j] + 1;
	             }
	            }
	       }
	       for(i = 0; i < n; i++ )
	       {
	          if(maximum_len < length_array[i] )
	           { 
	             maximum_len = length_array[i];
	           }
	       }
	       return maximum_len;
	    }
	    public static void main(String[] args)  
	    { 
	        Scanner sr = new Scanner(System.in);
	        int n = sr.nextInt();
	        int arr[][] = new int[n][2];
	        for(int i=0;i<n;i++)
	        {
	            arr[i][0] = sr.nextInt();
	            arr[i][1] = sr.nextInt();
	        } 
	        int ans = MaxChainLen(arr,n);
	        System.out.println("length of longest chain is: " + ans);
	    } 
	}