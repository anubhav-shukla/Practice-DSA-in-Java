package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortbySetBitCount2 {
	static int setBitCount(int num)
	  {
	    int count = 0;
	    while ( num != 0 )
	    {
	      if ( (num & 1) != 0)
	        count++;
	      num >>= 1;
	    }
	    return count;
	  }
	 
	  // Function to sort By SetBitCount
	  static void sortBySetBitCount(int[] arr, int n)
	  {
	    ArrayList<ArrayList<Integer>> count = new ArrayList<ArrayList<Integer>>();
	 
	    // Iterate over all values and
	    // insert into multimap
	    for( int i = 0 ; i < n ; ++i )
	    {
	      count.add(new ArrayList<Integer>(Arrays.asList((-1) * setBitCount(arr[i]), arr[i])));
	    }
	 
	    Collections.sort(count, new Comparator<ArrayList<Integer>>() {   
	      @Override
	      public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
	        return o1.get(0).compareTo(o2.get(0));
	      }              
	    });
	 
	    for(int i = 0; i < count.size(); i++)
	    {
	      System.out.print(count.get(i).get(1) + " ");
	    }
	 
	  }
	 
	  // Driver code
	  public static void main (String[] args)
	  {
	 
	    int arr[] = {1, 2, 3, 4, 5, 6};
	    int n = arr.length;
	    sortBySetBitCount(arr, n);
	  }
	
}
