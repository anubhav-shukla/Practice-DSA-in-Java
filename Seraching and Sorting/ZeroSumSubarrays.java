package DSA;

import java.util.HashMap;

public class ZeroSumSubarrays {
	public static long findSubarray(long[] arr ,int n) 
    {
     HashMap<Long,Integer> hm = new HashMap<>();
      long prefixSum =0;
      long count =0;
      for(int i =0;i<n;i++ ){
          prefixSum+=arr[i];
          if(prefixSum == 0)
               count+=1;
         if(hm.containsKey(prefixSum)){
           hm.put(prefixSum,hm.get(prefixSum)+1);
           count+=hm.get(prefixSum);
         }
         else
           hm.put(prefixSum,0);
      }
      return count;
   }
  public static void main(String ar[]) {
  int	  n = 6;
	long		  arr[] = {0,0,5,5,0,0};

	  System.out.print(findSubarray(arr,n));
  }
}
