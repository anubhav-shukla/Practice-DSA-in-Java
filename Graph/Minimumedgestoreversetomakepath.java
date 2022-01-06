package DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class Minimumedgestoreversetomakepath {
	static class Pair
	{
	    int first, second;
	 
	    public Pair(int first, int second)
	    {
	        this.first = first;
	        this.second = second;
	    }
	}
	static class Graph{
	     
	final int INF = (int)0x3f3f3f3f;
	 
	int V;
	List<Pair>[] adj;
	public Graph(int V)
	{
	    this.V = V;
	    adj = new ArrayList[V];
	 
	    for(int i = 0; i < V; i++)
	    {
	        adj[i] = new ArrayList();
	    }
	}
	 
	void addEdge(int u, int v, int w)
	{
	    adj[u].add(new Pair(v, w));
	}
	 
	int[] shortestPath(int src)
	{
	     
	    Set<Pair> setds = new HashSet<Pair>();
	 
	    int[] dist = new int[V];
	    Arrays.fill(dist, INF);
	    setds.add(new Pair(0, src));
	    dist[src] = 0;
	 
	    while (!setds.isEmpty())
	    {
	        Iterator<Pair> itr = setds.iterator();
	        Pair tmp = itr.next();
	        itr.remove();
	 
	        int u = tmp.second;
	 
	        for(Pair p : adj[u])
	        {
	            int v = p.first;
	            int weight = p.second;
	 
	            if (dist[v] > dist[u] + weight)
	            {
	                 
	                if (dist[v] != INF)
	                {
	                    setds.remove(new Pair(dist[v], v));
	                }
	                dist[v] = dist[u] + weight;
	                setds.add(new Pair(dist[v], v));
	            }
	        }
	    }
	    return dist;
	}
	}
	 
	static final int INF = (int)0x3f3f3f3f;
	 
	static Graph modelGraphWithEdgeWeight(int edge[][],
	                                      int E, int V)
	{
	    Graph g = new Graph(V);
	    for(int i = 0; i < E; i++)
	    {
	         
	        // Original edge : weight 0
	        g.addEdge(edge[i][0], edge[i][1], 0);
	 
	        // Reverse edge : weight 1
	        g.addEdge(edge[i][1], edge[i][0], 1);
	    }
	    return g;
	}
	 
	static int getMinEdgeReversal(int edge[][], int E,
	                              int V, int src, int dest)
	{
	     
	    Graph g = modelGraphWithEdgeWeight(edge, E, V);
	 
	    int[] dist = g.shortestPath(src);
	 
	    if (dist[dest] == INF)
	        return -1;
	    else
	        return dist[dest];
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int V = 7;
	    int edge[][] = { { 0, 1 }, { 2, 1 },
	                     { 2, 3 }, { 5, 1 },
	                     { 4, 5 }, { 6, 4 },
	                     { 6, 3 } };
	    int E = edge.length;
	 
	    int minEdgeToReverse = getMinEdgeReversal(
	        edge, E, V, 0, 6);
	     
	    if (minEdgeToReverse != -1)
	        System.out.println(minEdgeToReverse);
	    else
	        System.out.println("Not possible");
	}
	
}
