package DSA;
import java.io.*;
import java.util.*;
public class ChocolateDistributionProblem {
	public long findMinDiff(ArrayList<Long> a, long n, long m) {
		Collections.sort(a);
		long ans = Long.MAX_VALUE;
		if(n==m) return a.get(Math.toIntExact(n-1))-a.get(0);
		for(int i=0;i<n-m+1;i++) {
			long temp = a.get(Math.toIntExact(i+m-1))-a.get(i);
			ans = Math.min(ans, temp);
		}
		return ans;
	}
	public static void main(String[] args) {
	       long n = 8;
	       
	       long m = 5;
	       ArrayList<Long> arr = new ArrayList<>();
	       
	        arr.add((long) 7);
	        arr.add((long) 3);
	        arr.add((long) 2);
	        arr.add((long) 4);
	        arr.add((long) 9);
	        arr.add((long) 12);
	        arr.add((long) 56);
	        arr.add((long) 90);
	  
			ChocolateDistributionProblem ob = new ChocolateDistributionProblem();
			System.out.println(ob.findMinDiff(arr, n, m));
			
		}
	}
