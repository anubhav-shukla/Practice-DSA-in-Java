package DSA;

public class CheapestFlightsWithinKStops {
	static final int V = 4;
    static final int INF = Integer.MAX_VALUE;
 
    int shortestPath(int graph[][], int u, int v, int k)
    {
        // Base cases
        if (k == 0 && u == v)             return 0;
        if (k == 1 && graph[u][v] != INF) return graph[u][v];
        if (k <= 0)                       return INF;
 
        int res = INF;
 
        for (int i = 0; i < V; i++)
        {
            if (graph[u][i] != INF && u != i && v != i)
            {
                int rec_res = shortestPath(graph, i, v, k-1);
                if (rec_res != INF)
                    res = Math.min(res, graph[u][i] + rec_res);
            }
        }
        return res;
    }
 
    public static void main (String[] args)
    {
        int graph[][] = new int[][]{ {0, 10, 3, 2},
                                     {INF, 0, INF, 7},
                                     {INF, INF, 0, 6},
                                     {INF, INF, INF, 0}
                                   };
                                   CheapestFlightsWithinKStops t = new CheapestFlightsWithinKStops();
        int u = 0, v = 3, k = 2;
        System.out.println("Weight of the shortest path is "+
                           t.shortestPath(graph, u, v, k));
    }

}
