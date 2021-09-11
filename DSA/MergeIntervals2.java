package DSA;
import java.util.*;

public class MergeIntervals2 {
	  public static int[][] merge(int[][] intervals) {
	         Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // sorting all intervals based on start of interval
	        int[] tmp = intervals[0];
	        List<int[]> res = new ArrayList<>();
	        for(int[] interval: intervals){
	            if(interval[0] <= tmp[1]){ // if overlapping
	                tmp[1] = Math.max(tmp[1], interval[1]);
	            }else{ // if not overlapping, then current tmp will be in our result and overlapping of further intervals would be checked with `interval` hence updating tmp further with `interval`
	                res.add(tmp);
	                tmp = interval;
	            }
	        }
	        res.add(tmp); // the last interval is left, hence adding it
	        System.out.println(res.toArray(new int[0][]));
	        return res.toArray(new int[0][]);
	    }
	
public static void main(String[] arg) {
	 Interval arr[]=new Interval[4];
     arr[0]=new Interval(6,8);
     arr[1]=new Interval(1,9);
     arr[2]=new Interval(2,4);
     arr[3]=new Interval(4,7);
     merge(arr);
}}