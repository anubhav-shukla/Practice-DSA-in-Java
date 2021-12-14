package DSA;
import java.util.*;
public class pathofmorethanklengthfromasource {
	static class AdjListNode {
	    int v;
	    int weight;
	 
	    AdjListNode(int _v, int _w)
	    {
	      v = _v;
	      weight = _w;
	    }
	    int getV() { return v; }
	    int getWeight() { return weight; }
	  }
	  static class Graph
	  {
	    int V; // No. of vertices
	    ArrayList<ArrayList<AdjListNode>> adj;
	    Graph(int V)
	    {
	      this.V = V;
	      adj = new ArrayList<ArrayList<AdjListNode>>(V);
	 
	      for(int i = 0; i < V; i++)
	      {
	        adj.add(new ArrayList<AdjListNode>());
	      }
	    }
	    void addEdge(int u, int v, int weight)
	    {
	      AdjListNode node1 = new AdjListNode(v, weight);
	      adj.get(u).add(node1); // Add v to u's list
	 
	      AdjListNode node2 = new AdjListNode(u, weight);
	      adj.get(v).add(node2); // Add u to v's list
	    }
	    boolean pathMoreThanK(int src, int k)
	    {
      boolean path[] = new boolean[V];
	 
	      Arrays.fill(path, false);
	      path[src] = true;
	 
	      return pathMoreThanKUtil(src, k, path);
	    }
	    boolean pathMoreThanKUtil(int src, int k, boolean[] path)
	    { 
	      if (k <= 0)
	        return true;
	 
	      ArrayList<AdjListNode> it = adj.get(src);
	 
	      int index = 0;
	      for(int i = 0; i < adj.get(src).size(); i++)
	      {
	        AdjListNode vertex = adj.get(src).get(i);
	        int v = vertex.v;
	        int w = vertex.weight;
	        index++;
	        if (path[v] == true)
	          continue;
	        if (w >= k)
	          return true;
	        path[v] = true;
	        if (pathMoreThanKUtil(v, k-w, path))
	          return true;
	        path[v] = false;
	      }
	 
	      return false;
	    }
	 
	  }
	  public static void main(String[] args)
	  {
	     
	    int V = 9;
	    Graph g = new Graph(V);
	 
	    g.addEdge(0, 1, 4);
	    g.addEdge(0, 7, 8);
	    g.addEdge(1, 2, 8);
	    g.addEdge(1, 7, 11);
	    g.addEdge(2, 3, 7);
	    g.addEdge(2, 8, 2);
	    g.addEdge(2, 5, 4);
	    g.addEdge(3, 4, 9);
	    g.addEdge(3, 5, 14);
	    g.addEdge(4, 5, 10);
	    g.addEdge(5, 6, 2);
	    g.addEdge(6, 7, 1);
	    g.addEdge(6, 8, 6);
	    g.addEdge(7, 8, 7);
	 
	    int src = 0;
	    int k = 62;
	 
	    if(g.pathMoreThanK(src, k))
	      System.out.println("YES");
	    else
	      System.out.println("NO");
	 
	 
	    k = 60;
	    if(g.pathMoreThanK(src, k))
	      System.out.println("YES");
	    else
	      System.out.println("NO");
	 
	  }
	
}
