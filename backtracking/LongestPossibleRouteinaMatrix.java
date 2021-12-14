package DSA;

public class LongestPossibleRouteinaMatrix {
	static int R = 3;
	  static int C = 10;
	  static class Pair {
	 
	    boolean found;
	 
	    int val;
	 
	    Pair (boolean x, int y){
	      found = x;
	      val = y;
	    }
	  }
	 
	  static Pair findLongestPathUtil (int mat[][], int i, int j, int x, int y, boolean visited[][]) {
	    if(i == x && j == y)
	      return new Pair(true, 0);
	 
	    if(i < 0 || i >= R || j < 0 || j >= C || mat[i][j] == 0 || visited[i][j] )
	      return new Pair(false, Integer.MAX_VALUE);
	    visited[i][j] = true;
	 
	    int res = Integer.MIN_VALUE;
	    Pair sol = findLongestPathUtil(mat, i, j-1, x, y, visited);
	    if(sol.found)
	      res = Math.max(sol.val, res);
	    sol = findLongestPathUtil(mat, i, j+1, x, y, visited);
	 
    if(sol.found)
	      res = Math.max(sol.val, res);
	 	    sol = findLongestPathUtil(mat, i-1, j, x, y, visited);
	    if(sol.found)
	      res = Math.max(sol.val, res);
	    sol = findLongestPathUtil(mat, i+1, j, x, y, visited);
	    if(sol.found)
	      res = Math.max(sol.val, res);
	 
	    visited[i][j] = false;
	 
	    if(res != Integer.MIN_VALUE)
	      return new Pair(true, res+1);
	 
	    else
	      return new Pair(false, Integer.MAX_VALUE);
	 
	  } 
	 
	  static void findLongestPath (int mat[][], int i, int j, int x, int y) {
	 
	    boolean visited[][] = new boolean[R][C];
	 
	 
	    Pair p = findLongestPathUtil(mat, i, j, x, y, visited);
	 
	    if(p.found)
	      System.out.println("Length of longest possible route is " + p.val);
	    else
	      System.out.println("Destination not reachable from given source");
	 
	  }
	 
	 
	  public static void main (String[] args) {
	 
	    int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	                   { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
	                   { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
	 
	    findLongestPath(mat, 0, 0, 1, 7);
	 
	  }
	
}
