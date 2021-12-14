package DSA;
import java.util.*;
public class Printallpossiblepaths {
	  static ArrayList<ArrayList<Integer>> allPaths =
			    new ArrayList<ArrayList<Integer>>();
			  static void findPathsUtil(ArrayList<ArrayList<Integer>> maze,
			                            int m, int n, int i,int j,
			                            ArrayList<Integer> path,int index)
			  {
			 
			    if(i == m - 1)
			    {
			      for(int k = j; k < n; k++)
			      {
			        path.set(index + k - j, maze.get(i).get(k));
			 
			      }
			      System.out.print("[" + path.get(0) + ", ");
			      for(int z = 1; z < path.size() - 1; z++)
			      {
			        System.out.print(path.get(z) + ", ");
			      }
			      System.out.println(path.get(path.size() - 1) + "]");
			      allPaths.add(path);
			      return;
			    }
			    if(j == n - 1)
			    {
			      for(int k = i; k < m; k++)
			      {
			        path.set(index + k - i,maze.get(k).get(j));
			      }
			 
			      System.out.print("[" + path.get(0) + ", ");
			      for(int z = 1; z < path.size() - 1; z++)
			      {
			        System.out.print(path.get(z) + ", ");
			 
			      }
			      System.out.println(path.get(path.size() - 1) + "]");
			      allPaths.add(path);
			      return;
			    }
			 
			    path.set(index,maze.get(i).get(j));
			 
			    findPathsUtil(maze, m, n, i + 1, j, path, index + 1);
			 
			    findPathsUtil(maze, m, n, i, j + 1, path, index + 1);
			 
			  }
			  static void findPaths(ArrayList<ArrayList<Integer>> maze,
			                        int m, int n)
			  {
			    ArrayList<Integer> path = new ArrayList<Integer>();
			    for(int i = 0; i < m + n - 1; i++)
			    {
			      path.add(0);
			    }
			    findPathsUtil(maze, m, n, 0, 0, path, 0);
			  }
			 
			  // Driver code
			  public static void main (String[] args)
			  {
			    ArrayList<ArrayList<Integer>> maze =
			      new ArrayList<ArrayList<Integer>>();
			    maze.add(new ArrayList<Integer>
			             (Arrays.asList(1,2,3)));
			    maze.add(new ArrayList<Integer>
			             (Arrays.asList(4,5,6)));
			    maze.add(new ArrayList<Integer>
			             (Arrays.asList(7,8,9)));
			 
			    findPaths(maze, 3, 3);       
			  }
			
}
