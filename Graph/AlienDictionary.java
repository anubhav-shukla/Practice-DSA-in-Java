package DSA;
import java.util.*;
import java.util.LinkedList;
public class AlienDictionary {
    private final LinkedList<Integer>[] adjacencyList;

    AlienDictionary(int nVertices)
    {
        adjacencyList = new LinkedList[nVertices];
        for (int vertexIndex = 0; vertexIndex < nVertices;
             vertexIndex++) {
            adjacencyList[vertexIndex] = new LinkedList<>();
        }
    }
    void addEdge(int startVertex, int endVertex)
    {
        adjacencyList[startVertex].add(endVertex);
    }

    private int getNoOfVertices()
    {
        return adjacencyList.length;
    }

    private void topologicalSortUtil(int currentVertex,
                                     boolean[] visited,
                                     Stack<Integer> stack)
    {
        visited[currentVertex] = true;

        for (int adjacentVertex :
             adjacencyList[currentVertex]) {
            if (!visited[adjacentVertex]) {
                topologicalSortUtil(adjacentVertex, visited,
                                    stack);
            }
        }

        stack.push(currentVertex);
    }

    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[getNoOfVertices()];
        for (int i = 0; i < getNoOfVertices(); i++) {
            visited[i] = false;
        }

        for (int i = 0; i < getNoOfVertices(); i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print((char)('a' + stack.pop())
                             + " ");
        }
    }


    private static void printOrder(String[] words, int n,
                                   int alpha)
    {
    	AlienDictionary graph = new AlienDictionary(alpha);

        for (int i = 0; i < n - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            for (int j = 0; j < Math.min(word1.length(),
                                         word2.length());
                 j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    graph.addEdge(word1.charAt(j) - 'a',
                                  word2.charAt(j) - 'a');
                    break;
                }
            }
        }

        graph.topologicalSort();
    }

public static void main(String[] args)
    {
        String[] words = { "caa", "aaa", "aab" };
        printOrder(words, 3, 3);
    }

}
