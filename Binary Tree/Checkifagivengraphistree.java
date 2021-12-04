package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class Edge
{
    int source, dest;
 
    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
    }
}
class Graph
{
    List<List<Integer>> adjList = null;
 
    Graph(List<Edge> edges, int n)
    {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
 
        for (Edge edge: edges)
        {
            int src = edge.source;
            int dest = edge.dest;
 
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}
 
class Checkifagivengraphistree
{
    public static boolean DFS(Graph graph, int v, boolean[] discovered, int parent)
    {
        discovered[v] = true;
 
        for (int w: graph.adjList.get(v))
        {
            if (!discovered[w])
            {
                if (!DFS(graph, w, discovered, v)) {
                    return false;
                }
            }
 
            else if (w != parent)
            {
                return false;
            }
        }
        return true;
    }
 
    public static boolean isTree(Graph graph, int n)
    {
        boolean[] discovered = new boolean[n];
 
        boolean isTree = DFS(graph, 0, discovered, -1);
 
        for (int i = 0; isTree && i < n; i++)
        {
            if (!discovered[i]) {
                isTree = false;
            }
        }
 
        return isTree;
    }
 
    public static void main(String[] args)
    {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1), new Edge(1, 2), new Edge(2, 3),
                new Edge(3, 4), new Edge(4, 5), new Edge(5, 0)
           
        );
 
        int n = 6;
 
        Graph graph = new Graph(edges, n);
 
        if (isTree(graph, n)) {
            System.out.println("The graph is a tree");
        }
        else {
            System.out.println("The graph is not a tree");
        }
    }
}
