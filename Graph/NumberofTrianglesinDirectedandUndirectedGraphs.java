package DSA;

public class NumberofTrianglesinDirectedandUndirectedGraphs {
	int V = 4;
	 
   
    int countTriangle(int graph[][],
                      boolean isDirected)
   {
       int count_Triangle = 0;
 
       for (int i = 0; i < V; i++)
       {
           for (int j = 0; j < V; j++)
           {
               for (int k=0; k<V; k++)
               {
                  if (graph[i][j] == 1 &&
                      graph[j][k] == 1 &&
                      graph[k][i] == 1)
                      count_Triangle++;
               }
           }
       }
       if(isDirected == true)
       {
           count_Triangle /= 3;
       }
       else
       {
           count_Triangle /= 6;
       }
       return count_Triangle;
   }
  
    public static void main(String args[])
   {
        
       int graph[][] = {{0, 1, 1, 0},
                        {1, 0, 1, 1},
                        {1, 1, 0, 1},
                        {0, 1, 1, 0}
                       };
     
       int digraph[][] = { {0, 0, 1, 0},
                           {1, 0, 0, 1},
                           {0, 1, 0, 0},
                           {0, 0, 1, 0}
                         };
       
       NumberofTrianglesinDirectedandUndirectedGraphs obj = new NumberofTrianglesinDirectedandUndirectedGraphs();
  
    System.out.println("The Number of triangles "+
                       "in undirected  : " +
                        obj.countTriangle(graph, false));
 
    System.out.println("\n\nThe Number of triangles"+
                       " in directed  : "+
                       obj.countTriangle(digraph, true));
 
   }

}
