package DSA;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
//The time complexity of above solution is O(n^3). This can be optimized to O(n^2).


public class WordBreak {
	public static void main(String[] args) {
	    List dict = new ArrayList<>();
	    dict.add("cat");
	     dict.add("cats");
	     dict.add("and");
	     dict.add("sand");
	     dict.add("dog");
	     System.out.println(new WordBreak().wordbreak("catsanddog", dict));
	  }

	  public boolean wordbreak(String words, List dict) {
	    boolean mat[][] = new boolean[words.length()][words.length()];
	    
	    //initialize matrix
	    for (int i = 0; i < words.length(); i++)
	      mat[i][i] = dict.contains(words.charAt(i)+"");

	    for (int l = 2; l <= words.length(); l++) {
	      for (int i = 0; i < words.length() - l + 1; i++) {
	        int j = i + l - 1;
	        if (dict.contains(words.substring(i, j+1))) {
	          mat[i][j] = true;
	          continue;
	        }
	        for (int k = i; k < j; k++) {
	          if (mat[i][k] == true && mat[k+1][j] == true) {
	            mat[i][j] = true;
	            continue;
	          }
	        }
	      }
	    }
	    return mat[0][words.length() - 1];
	  }
	}