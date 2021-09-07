package DSA;

import java.util.Arrays;

public class minThemaxDifference2 {
    
    	int getMinDiff(int[] arr,int n,int k) {
    		Arrays.sort(arr);
    		int maxelement,minelement;
    		int result = Math.abs(arr[0] - arr[n-1]);
    		
    		for(int i=1; i<n; i++) {
    			if(arr[i] >= k) {
    				maxelement = Math.max(arr[i-1]+k, arr[n-1]-k);
    				minelement = Math.min(arr[0]+k,arr[i]-k);
    				
    				result = Math.min(result, maxelement-minelement);
    			}
    		}
    		System.out.println(result);
    		return result;
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,5,6,7,89,9 };
      minThemaxDifference2 ob = new minThemaxDifference2();
      ob.getMinDiff(arr,6,2);
	}

}
