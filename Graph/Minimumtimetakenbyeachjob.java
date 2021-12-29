package DSA;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Minimumtimetakenbyeachjob {
	static final int maxN = 100000;
	 
	@SuppressWarnings("unchecked")
	static Vector<Integer> []Minimumtimetakenbyeachjob = new Vector[maxN];
	 
	static int []indegree = new int[maxN];
	 
	static int []job = new int[maxN];
	 
	static void addEdge(int u, int v)
	{
	     
		Minimumtimetakenbyeachjob[u].add(v);
	 
	    indegree[v]++;
	}
	 
	static void printOrder(int n, int m)
	{
	     
	  
	    Queue<Integer> q = new LinkedList<>();
	     
	    for(int i = 1; i <= n; i++)
	    {
	        if (indegree[i] == 0)
	        {
	            q.add(i);
	            job[i] = 1;
	        }
	    }
	 
	    while (!q.isEmpty())
	    {
	 
	        int cur = q.peek();
	 
	        q.remove();
	 
	        for(int adj : Minimumtimetakenbyeachjob[cur])
	        {
	             
	            indegree[adj]--;
	 
	            if (indegree[adj] == 0){
	                job[adj] = 1 + job[cur];
	                q.add(adj);
	            }
	        }
	    }
	    for(int i = 1; i <= n; i++)
	        System.out.print(job[i] + " ");
	    System.out.print("\n");
	}
	 
	public static void main(String[] args)
	{
	     
	    int n, m;
	    n = 10;
	    m = 13;
	     
	    for(int i = 0; i < Minimumtimetakenbyeachjob.length; i++)
	    	Minimumtimetakenbyeachjob[i] = new Vector<Integer>();
	         
	    addEdge(1, 3);
	    addEdge(1, 4);
	    addEdge(1, 5);
	    addEdge(2, 3);
	    addEdge(2, 8);
	    addEdge(2, 9);
	    addEdge(3, 6);
	    addEdge(4, 6);
	    addEdge(4, 8);
	    addEdge(5, 8);
	    addEdge(6, 7);
	    addEdge(7, 8);
	    addEdge(8, 10);
	 
	    printOrder(n, m);
	}
	
}
