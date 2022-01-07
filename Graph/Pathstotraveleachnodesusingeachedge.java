package DSA;
import java.util.*;
public class Pathstotraveleachnodesusingeachedge {
	static class Graph
    {
        int V;
 
        ArrayList<ArrayList<Integer>> adj;
 
        Graph(int V)
        {
            this.V = V;
            adj = new ArrayList<ArrayList<Integer>>();
 
            for(int i=0; i<V; i++){
                adj.add(new ArrayList<Integer>());
            }
        }
 
 
        void addEdge(int u, int v)
        {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
 
        void rmvEdge(int u, int v)
        {
            int iv = find(adj.get(u), v);
            adj.get(u).set(iv, -1);
 
 
            int iu = find(adj.get(v), u);
            adj.get(v).set(iu, -1);
        }
 
        int find(ArrayList<Integer> al, int v){
 
            for(int i=0; i<al.size(); i++){
                if(al.get(i) == v){
                    return i;
                }
            }
 
            return -1;
        }
 
        void printEulerTour()
        {
           
            int u = 0;
 
            for (int i = 0; i < V; i++){
                if (adj.get(i).size() % 2 == 1)
                {
                    u = i;
                    break;
                }
            }
 
            printEulerUtil(u);
            System.out.println();
        }
         
        void printEulerUtil(int u)
        {
 
            for (int i = 0; i<adj.get(u).size(); ++i)
            {
                int v = adj.get(u).get(i);
 
                if (v != -1 && isValidNextEdge(u, v))
                {
                    System.out.print(u + "-" + v + " ");
                    rmvEdge(u, v);
                    printEulerUtil(v);
                }
            }
        }
 
        int DFSCount(int v, boolean visited[])
        {
            visited[v] = true;
            int count = 1;
 
            for (int i = 0; i<adj.get(v).size(); ++i){
                int u = adj.get(v).get(i);
 
                if (u != -1 && !visited[u]){
                    count += DFSCount(u, visited);
                }
            }
 
            return count;
        }
 
        boolean isValidNextEdge(int u, int v)
        {
        	 int count = 0;
            for (int i = 0; i<adj.get(u).size(); ++i)
                if (adj.get(u).get(i) != -1)
                    count++;
            if (count == 1)
                return true;
 
 
            boolean visited[] = new boolean[V];
            Arrays.fill(visited, false);
            int count1 = DFSCount(u, visited);
 
            rmvEdge(u, v);
            Arrays.fill(visited, false);
            int count2 = DFSCount(u, visited);
 
            addEdge(u, v);
 
            return (count1 > count2)? false: true;
        }
    }
 
    public static void main(String args[])
    {
        Graph g1 = new Graph(4);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);
        g1.printEulerTour();
 
        Graph g3 = new Graph(4);
        g3.addEdge(0, 1);
        g3.addEdge(1, 0);
        g3.addEdge(0, 2);
        g3.addEdge(2, 0);
        g3.addEdge(2, 3);
        g3.addEdge(3, 1);
 
        g3.printEulerTour();
    }
}

