package DSA;

import java.util.Arrays;

public class FindPairGivenDifference {
	static boolean findPair(int a[], int n, int d)
	   {
	       //code here.
	       d=Math.abs(d);
	       Arrays.sort(a);
	       for(int i=0,j=1;j<n;){
	           if(a[j]-a[i]==d) return true;
	           if(a[j]-a[i]<d && i<=j) j++;
	           else i++;
	       }
	       return false;
	   }
	public static void main(String ar[]) {
  int  L = 6, N = 78;
				int arr[] = {5, 20, 3, 2, 5, 80};
				System.out.println(findPair(arr,L,N));

	}
}
