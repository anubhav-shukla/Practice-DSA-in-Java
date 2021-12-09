package DSA;
import java.util.*;

public class BuyMaximumStocks {
	
	static class Pair {
	    int first, second;
	    Pair(int first, int second)
	    {
	        this.first = first;
	        this.second = second;
	    }
	}
	 
	static class SortPair implements Comparator<Pair> {
	    public int compare(Pair a, Pair b)
	    {
	        return a.first - b.first;
	    }
	}
	 
	 
	    static int buyMaximumProducts(int[] price, int K, int n)
	    {
	        Pair[] arr = new Pair[n];
	 
	        for (int i = 0; i < n; i++)
	            arr[i] = new Pair(price[i], i + 1);
	 
	        Arrays.sort(arr, new SortPair());
	      
	        int ans = 0;
	        for (int i = 0; i < n; i++) {
	            ans += Math.min(arr[i].second,
	                            K / arr[i].first);
	            K -= arr[i].first
	                 * Math.min(arr[i].second,
	                            K / arr[i].first);
	        }
	        return ans;
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] price = { 10, 7, 19 };
	        int K = 45;
	       
	        System.out.println(
	            buyMaximumProducts(price, K, price.length));
	    }
	
}
