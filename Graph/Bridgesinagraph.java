package DSA;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
 

public class Bridgesinagraph {
	private int V;   // No. of vertices
	 
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NIL = -1;
 
    // Constructor
    @SuppressWarnings("unchecked")Bridgesinagraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
        adj[w].add(v);    //Add v to w's list
    }
 
    void bridgeUtil(int u, boolean visited[], int disc[],
                    int low[], int parent[])
    {
 
        visited[u] = true;
        disc[u] = low[u] = ++time;
 
        Iterator<Integer> i = adj[u].iterator();
        while (i.hasNext())
        {
            int v = i.next();  // v is current adjacent of u
 
            if (!visited[v])
            {
                parent[v] = u;
                bridgeUtil(v, visited, disc, low, parent);
 
                low[u]  = Math.min(low[u], low[v]);
 
                if (low[v] > disc[u])
                    System.out.println(u+" "+v);
            }
            else if (v != parent[u])
                low[u]  = Math.min(low[u], disc[v]);
        }
    }
 
 
    void bridge()
    {
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];
 
 
        for (int i = 0; i < V; i++)
        {
            parent[i] = NIL;
            visited[i] = false;
        }
 
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                bridgeUtil(i, visited, disc, low, parent);
    }
 
    public static void main(String args[])
    {
        System.out.println("Bridges in first graph ");
        Bridgesinagraph g1 = new Bridgesinagraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.bridge();
        System.out.println();
 
        System.out.println("Bridges in Second graph");
        Bridgesinagraph g2 = new Bridgesinagraph(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 3);
        g2.bridge();
        System.out.println();
 
        System.out.println("Bridges in Third graph ");
        Bridgesinagraph g3 = new Bridgesinagraph(7);
        g3.addEdge(0, 1);
        g3.addEdge(1, 2);
        g3.addEdge(2, 0);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(1, 6);
        g3.addEdge(3, 5);
        g3.addEdge(4, 5);
        g3.bridge();
    }

}
