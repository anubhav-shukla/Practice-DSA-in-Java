package DSA;
import java.util.*;

public class JobSequencingProblem {

	    char id;
	    int deadline, profit;

	    public JobSequencingProblem() {}

	    public JobSequencingProblem(char id, int deadline, int profit)
	    {
	        this.id = id;
	        this.deadline = deadline;
	        this.profit = profit;
	    }

	    void printJobScheduling(ArrayList<JobSequencingProblem> arr, int t)
	    {
	        int n = arr.size();

	        Collections.sort(arr,
	                         (a, b) -> b.profit - a.profit);
	        boolean result[] = new boolean[t];

	        char job[] = new char[t];

	        for (int i = 0; i < n; i++) 
	        {
	            for (int j
	                 = Math.min(t - 1, arr.get(i).deadline - 1);
	                 j >= 0; j--) {

	                if (result[j] == false) 
	                {
	                    result[j] = true;
	                    job[j] = arr.get(i).id;
	                    break;
	                }
	            }
	        }
	        for (char jb : job) 
	        {
	            System.out.print(jb + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String args[])
	    {
	        ArrayList<JobSequencingProblem> arr = new ArrayList<JobSequencingProblem>();

	        arr.add(new JobSequencingProblem('a', 2, 100));
	        arr.add(new JobSequencingProblem('b', 1, 19));
	        arr.add(new JobSequencingProblem('c', 2, 27));
	        arr.add(new JobSequencingProblem('d', 1, 25));
	        arr.add(new JobSequencingProblem('e', 3, 15));
	      
	        System.out.println("Following is maximum "
	                           + "profit sequence of jobs");

	        JobSequencingProblem job = new JobSequencingProblem();

	        job.printJobScheduling(arr, 3);
	    }
	}

