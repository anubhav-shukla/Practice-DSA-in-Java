package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class WeightedJobScheduling {
	static class Job
	{
	    int start, finish, profit;
	    Job(int start, int finish, int profit)
	     {
	        this.start = start;
	        this.finish = finish;
	        this.profit = profit;
	     }
	}

	static int latestNonConflict(Job arr[], int i)
	{
	    for (int j = i - 1; j >= 0; j--)
	    {
	        if (arr[j].finish <= arr[i - 1].start)
	            return j;
	    }
	    return -1;
	}

	static int findMaxProfitRec(Job arr[], int n)
	{
	    if (n == 1) return arr[n-1].profit;
	    int inclProf = arr[n-1].profit;
	    int i = latestNonConflict(arr, n);
	    if (i != -1)
	    inclProf += findMaxProfitRec(arr, i+1);

	    int exclProf = findMaxProfitRec(arr, n-1);

	    return Math.max(inclProf, exclProf);
	}

	static int findMaxProfit(Job arr[], int n)
	{
	    Arrays.sort(arr,new Comparator<Job>(){
	       public int compare(Job j1,Job j2)
	        {
	           return j1.finish-j2.finish;
	        }
	       });

	    return findMaxProfitRec(arr, n);
	}

	public static void main(String args[])
	{
	   int m = 4;
	   Job arr[] = new Job[m];
	    arr[0] = new Job(3, 10, 20);
	    arr[1] = new Job(1, 2, 50); 
	    arr[2] = new Job(6, 19, 100);
	    arr[3] = new Job(2, 100, 200);
	    int n =arr.length;
	    System.out.println("The optimal profit is " + findMaxProfit(arr, n));
	}
	
}
