package DSA;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class CloneGraph {
	 int val;

	    Vector<CloneGraph> neighbours;
	    public CloneGraph(int val)
	    {
	        this.val = val;
	        neighbours = new Vector<CloneGraph>();
	    }
	}
	  
	class Graph
	{
	    public CloneGraph cloneGraph(CloneGraph source)
	    {
	        Queue<CloneGraph> q = new LinkedList<CloneGraph>();
	        q.add(source);
	  
	        HashMap<CloneGraph,CloneGraph> hm =
	                        new HashMap<CloneGraph,CloneGraph>();
	  
	        hm.put(source,new CloneGraph(source.val));
	  
	        while (!q.isEmpty())
	        {
	        	CloneGraph u = q.poll();
	  
	        	CloneGraph cloneNodeU = hm.get(u);
	            if (u.neighbours != null)
	            {
	                Vector<CloneGraph> v = u.neighbours;
	                for (CloneGraph graphNode : v)
	                {
	                	CloneGraph cloneNodeG = hm.get(graphNode);
	  
	                    if (cloneNodeG == null)
	                    {
	                        q.add(graphNode);
	  
	                        cloneNodeG = new CloneGraph(graphNode.val);
	                        hm.put(graphNode,cloneNodeG);
	                    }
	  
	                    cloneNodeU.neighbours.add(cloneNodeG);
	                }
	            }
	        }
	  
	        return hm.get(source);
	    }
	  
	    public CloneGraph buildGraph()
	    {
	        
	    	CloneGraph node1 = new CloneGraph(1);
	        CloneGraph node2 = new CloneGraph(2);
	        CloneGraph node3 = new CloneGraph(3);
	        CloneGraph node4 = new CloneGraph(4);
	        Vector<CloneGraph> v = new Vector<CloneGraph>();
	        v.add(node2);
	        v.add(node4);
	        node1.neighbours = v;
	        v = new Vector<CloneGraph>();
	        v.add(node1);
	        v.add(node3);
	        node2.neighbours = v;
	        v = new Vector<CloneGraph>();
	        v.add(node2);
	        v.add(node4);
	        node3.neighbours = v;
	        v = new Vector<CloneGraph>();
	        v.add(node3);
	        v.add(node1);
	        node4.neighbours = v;
	        return node1;
	    }
	  
	    public void bfs(CloneGraph source)
	    {
	        Queue<CloneGraph> q = new LinkedList<CloneGraph>();
	        q.add(source);
	        HashMap<CloneGraph,Boolean> visit =
	                          new HashMap<CloneGraph,Boolean>();
	        visit.put(source,true);
	        while (!q.isEmpty())
	        {
	        	CloneGraph u = q.poll();
	            System.out.println("Value of Node " + u.val);
	            System.out.println("Address of Node " + u);
	            if (u.neighbours != null)
	            {
	                Vector<CloneGraph> v = u.neighbours;
	                for (CloneGraph g : v)
	                {
	                    if (visit.get(g) == null)
	                    {
	                        q.add(g);
	                        visit.put(g,true);
	                    }
	                }
	            }
	        }
	        System.out.println();
	    }
	}
	  
	class Main
	{
	    public static void main(String args[])
	    {
	        Graph graph = new Graph();
	        CloneGraph source = graph.buildGraph();
	        System.out.println("BFS traversal of a graph before cloning");
	        graph.bfs(source);
	        CloneGraph newSource = graph.cloneGraph(source);
	        System.out.println("BFS traversal of a graph after cloning");
	        graph.bfs(newSource);
	    }
	
}
