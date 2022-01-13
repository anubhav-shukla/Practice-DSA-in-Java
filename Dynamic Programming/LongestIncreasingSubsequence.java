package DSA;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	static int longestSubsequence(int size, int a[])
	   {
	       // code here
	       int ans[] = new int[size];
	       Arrays.fill(ans, 1);
	       int max ;
	       int temp, i,j;
	       for ( i =1; i<size; i++ ){
	           max = 0;
	           for ( j = 0; j<i; j++){
	               if ( a[j] < a[i] ){
	                   max = Math.max(1+ans[j], max);
	               }
	              
	               
	           }
	            if ( max == 0){
	                   ans[j] = 1;
	               }
	               else{
	                   ans[j] = max;
	               }
	       }
	       int max1= 0;
	       for ( i =0; i<size; i++){
	           max1 = Math.max(max1, ans[i]);
	       }
	       return max1;
	       
	   }

public static void main(String ar[]) {
	int N = 6;
		int	A[] = {5,8,3,7,9,1};
	System.out.println(longestSubsequence(N,A));
}
}
