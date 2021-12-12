package DSA;
import java.util.*;

public class RatinaMazeProblem1 {
	static Vector<String> possiblePaths = new Vector<>();
	static String path = "";
	static final int MAX =  5;
	static boolean isSafe(int row, int col, int m[][], 
	                      int n, boolean visited[][])
	{
	    if (row == -1 || row == n || col == -1 || 
	         col == n || visited[row][col] || 
	                     m[row][col] == 0)
	        return false;

	    return true;
	}
	static void printPathUtil(int row, int col, int m[][], 
	                          int n, boolean visited[][])
	{
	    
	    if (row == -1 || row == n || col == -1 ||
	         col == n || visited[row][col] || 
	                     m[row][col] == 0)
	        return;

	    if (row == n - 1 && col == n - 1)
	    {
	        possiblePaths.add(path);
	        return;
	    }
	    visited[row][col] = true;


	    if (isSafe(row + 1, col, m, n, visited))
	    {
	        path += 'D';
	        printPathUtil(row + 1, col, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }

	    if (isSafe(row, col - 1, m, n, visited))
	    {
	        path += 'L';
	        printPathUtil(row, col - 1, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }
	    if (isSafe(row, col + 1, m, n, visited)) 
	    {
	        path += 'R';
	        printPathUtil(row, col + 1, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }

	    if (isSafe(row - 1, col, m, n, visited))
	    {
	        path += 'U';
	        printPathUtil(row - 1, col, m, n,
	                      visited);
	        path = path.substring(0, path.length() - 1);
	    }

	    visited[row][col] = false;
	}

	static void printPath(int m[][], int n)
	{
	    boolean [][]visited = new boolean[n][MAX];
	    
	    printPathUtil(0, 0, m, n, visited);
	    for(int i = 0; i < possiblePaths.size(); i++)
	        System.out.print(possiblePaths.get(i) + " ");
	}
	public static void main(String[] args)
	{
	    int m[][] = { { 1, 0, 0, 0, 0 },
	                  { 1, 1, 1, 1, 1 },
	                  { 1, 1, 1, 0, 1 },
	                  { 0, 0, 0, 0, 1 },
	                  { 0, 0, 0, 0, 1 } };
	    int n = m.length;
	    
	    printPath(m, n);
	}
	
}
