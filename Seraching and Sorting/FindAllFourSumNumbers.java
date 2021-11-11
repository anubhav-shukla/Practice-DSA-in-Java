package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllFourSumNumbers {
	public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
	       // code here
	      ArrayList<ArrayList<Integer>> ol=new ArrayList<ArrayList<Integer>>();
	      int n = arr.length;
	      int sum=0;
	      if (n < 4) return ol;

	      Arrays.sort(arr);
	      for(int i=0;i<n-3;i++){
	          if(i>0&&arr[i-1]==arr[i])continue;
	          for(int j=i+1;j<n-2;j++){
	               if(j>i+1&&arr[j-1]==arr[j])continue;
	               int l=j+1,h=n-1;
	               while(l<h){
	                   int l1=l;
	                   int r1=h;
	                   sum=arr[i]+arr[j]+arr[l]+arr[h];
	                   if(sum==k){
	                   ArrayList<Integer> li=new ArrayList<Integer>();
	                   li.add(arr[i]);li.add(arr[j]);li.add(arr[l]);li.add(arr[h]);
	                   ol.add(li);
	                   while (l < h && arr[l] == arr[l1]) l++;
	                       while (l < h && arr[h] == arr[r1]) h--;
	                   }
	                   else if(sum<k)l++;
	                   else h--;
	               }
	          }
	      }
	      return ol;
	   }
	public static void main(String ar[]) {
	int 	N = 5, K = 3;
	int A[] = {0,0,2,1,1};
	System.out.println(fourSum(A,K));
	}
}
