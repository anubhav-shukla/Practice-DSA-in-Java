package DSA;
import java.util.*;
import java.util.LinkedList;
public class DetectCycleinaDirectedGraph {
	 private final int V;
	    private final List<List<Integer>> adj;
	  
	    public DetectCycleinaDirectedGraph(int V) 
	    {
	        this.V = V;
	        adj = new ArrayList<>(V);
	          
	        for (int i = 0; i < V; i++)
	            adj.add(new LinkedList<>());
	    }
	      
	    private boolean isCyclicUtil(int i, boolean[] visited,
	                                      boolean[] recStack) 
	    {
	        if (recStack[i])
	            return true;
	  
	        if (visited[i])
	            return false;
	              
	        visited[i] = true;
	  
	        recStack[i] = true;
	        List<Integer> children = adj.get(i);
	          
	        for (Integer c: children)
	            if (isCyclicUtil(c, visited, recStack))
	                return true;
	                  
	        recStack[i] = false;
	  
	        return false;
	    }
	  
	    private void addEdge(int source, int dest) {
	        adj.get(source).add(dest);
	    }
	    private boolean isCyclic() 
	    {
	          
	        boolean[] visited = new boolean[V];
	        boolean[] recStack = new boolean[V];
	          
	          
	        for (int i = 0; i < V; i++)
	            if (isCyclicUtil(i, visited, recStack))
	                return true;
	  
	        return false;
	    }
	  
	    public static void main(String[] args)
	    {
	    	DetectCycleinaDirectedGraph graph = new DetectCycleinaDirectedGraph(4);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 2);
	        graph.addEdge(2, 0);
	        graph.addEdge(2, 3);
	        graph.addEdge(3, 3);
	          
	        if(graph.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't "
	                                    + "contain cycle");
	    }
	
}
