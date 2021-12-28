package DSA;
import java.util.*;
public class NumberofOperationstoMakeNetworkConnected {
	 public static void DFS(HashMap<Integer, ArrayList<Integer> > adj,
             int node, boolean visited[])
{
if (visited[node])
return;

visited[node] = true;

for (int x : adj.get(node)) {

if (visited[x] == false)
  DFS(adj, x, visited);
}
}

public static int
makeConnectedUtil(int N, int connections[][], int M)
{
boolean visited[] = new boolean[N];

HashMap<Integer, ArrayList<Integer> > adj
= new HashMap<>();

for (int i = 0; i < N; i++) {
adj.put(i, new ArrayList<Integer>());
}

int edges = 0;

for (int i = 0; i < M; ++i) {

ArrayList<Integer> l1
  = adj.get(connections[i][0]);
ArrayList<Integer> l2
  = adj.get(connections[i][0]);

l1.add(connections[i][1]);
l2.add(connections[i][0]);

edges += 1;
}

int components = 0;

for (int i = 0; i < N; ++i) {

if (visited[i] == false) {

  components += 1;

  DFS(adj, i, visited);
}
}
if (edges < N - 1)
return -1;

int redundant
= edges - ((N - 1) - (components - 1));

if (redundant >= (components - 1))
return components - 1;

return -1;
}

public static void
makeConnected(int N, int connections[][], int M)
{
int minOps = makeConnectedUtil(N, connections, M);

System.out.println(minOps);
}

public static void main(String[] args)
{
int N = 4;

int connections[][]
= { { 0, 1 }, { 0, 2 }, { 1, 2 } };
int M = connections.length;

makeConnected(N, connections, M);
}

}
