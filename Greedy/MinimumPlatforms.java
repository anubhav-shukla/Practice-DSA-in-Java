package DSA;
import java.io.*;
import java.util.*;

public class MinimumPlatforms {
	
	static class pair 
	{
	    int first;
	    char second;
	    
	    pair(int key1, char key2)
	    {
	        this.first = key1;
	        this.second = key2;
	    }
	}

	    
	public static int findPlatform(int arr[], int dep[],
	                               int n)
	{
	    
	    ArrayList<pair> order = new ArrayList<>();
	    for(int i = 0; i < n; i++)
	    {
	        order.add(new pair(arr[i], 'a'));
	        order.add(new pair(dep[i], 'd'));
	    }

	    Collections.sort(order, new Comparator<pair>()
	    {
	        public int compare(pair p1, pair p2)
	        {
	            if (p1.first == p2.first)
	                return new Character(p1.second)
	                    .compareTo(
	                        new Character(p2.second));
	                        
	            return p1.first - p2.first;
	        }
	    });
	    
	    int result = 1;
	    int plat_needed = 0;
	    
	    for(int i = 0; i < order.size(); i++) 
	    {
	        pair p = order.get(i);
	        
	        if (p.second == 'a')
	            plat_needed++;
	        else
	            plat_needed--;
	            
	        if (plat_needed > result)
	            result = plat_needed;
	    }
	    return result;
	}

	public static void main(String[] args)
	{
	    int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
	    int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	    int n = 6;
	    
	    System.out.println("Minimum Number of " + 
	                       "Platforms Required = " + 
	                       findPlatform(arr, dep, n));
	}
	
}
