package DSA;
import java.util.*;
import java.io.*;
public class minThemaxDifference {
	static int getMinDiff(int[] arr, int n, int k) {
		// code here
		if (n == 1)
		return 0;

		// Sort all elements
		Arrays.sort(arr);

		// Initialize result
		int ans = arr[n-1] - arr[0];

		for(int i = 0; i < n-1; i++)
		{
		if(arr[i+1] < k)
		{
		continue;
		}
		int currMin = Math.min(arr[i+1]-k, arr[0]+k);
		int currMax = Math.max(arr[i]+k, arr[n-1]-k);
		ans = Math.min(ans, currMax-currMin);


		}
        System.out.println(ans);
		return ans;

		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		getMinDiff(a,5,2);
	}

}
