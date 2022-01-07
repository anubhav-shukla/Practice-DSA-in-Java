package DSA;
import java.util.ArrayDeque;
import java.util.Deque;
public class TwoCliqueProblem {
	static int V = 5;
	   
	static boolean isBipartiteUtil(int G[][], int src, int colorArr[])
	{
	    colorArr[src] = 1;
	   
	    Deque <Integer> q = new ArrayDeque<>();
	    q.push(src);
	   
	    while (!q.isEmpty())
	    {
	        int u = q.peek();
	        q.pop();
	   
	        for (int v = 0; v < V; ++v)
	        {
	          
	            if (G[u][v] == -1 && colorArr[v] == -1)
	            {
	                colorArr[v] = 1 - colorArr[u];
	                q.push(v);
	            }
	   
	            else if (G[u][v] == colorArr[u] && colorArr[v] == colorArr[u])
	                return false;
	        }
	    }
	   
	    return true;
	}
	   
	static boolean isBipartite(int G[][])
	{
	    int colorArr[]=new int[V];
	    for (int i = 0; i < V; ++i)
	        colorArr[i] = -1;
	   
	    for (int i = 0; i < V; i++)
	        if (colorArr[i] == -1)
	            if (isBipartiteUtil(G, i, colorArr) == false)
	                return false;
	   
	    return true;
	}
	   
	static boolean canBeDividedinTwoCliques(int G[][])
	{
	    int GC[][]=new int[V][V];
	    for (int i=0; i<V; i++)
	        for (int j=0; j<V; j++)
	             GC[i][j] = (i != j)?  -GC[i][j] : 0;
	   
	    return  isBipartite(GC);
	}
	   
	public static void main(String[] args) {
	     int G[][] = {{0, 1, 1, 1, 0},
	        {1, 0, 1, 0, 0},
	        {1, 1, 0, 0, 0},
	        {0, 1, 0, 0, 1},
	        {0, 0, 0, 1, 0}
	    };
	   
	    if(canBeDividedinTwoCliques(G))
	             System.out.println("Yes");
	    else
	        System.out.println("No");
	    }
	
}
