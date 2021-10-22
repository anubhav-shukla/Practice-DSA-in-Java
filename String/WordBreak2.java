package DSA;

import java.util.Arrays;
import java.util.List;

public class WordBreak2 {
	public static boolean wordBreak(String s, List<String> wordDict) {
	    boolean[] f = new boolean[s.length() + 1];
	    f[0] = true;
	    for (int i = 1; i <= s.length(); i++) {
	      for (int j = 0; j<i; j++) {
	        if (f[j] && wordDict.contains(s.substring(j, i))) {
	          f[i] = true;
	          break;
	        }
	      }
	    }
	    return f[s.length()];
	  }
	public static void main(String ar[]) {
		int n = 12;
		List<String> B = Arrays.asList("i", "like", "sam",
				"sung", "samsung", "mobile",
				"ice","cream", "icecream",
				"man", "go", "mango");
		String A="ilike";
				System.out.println(wordBreak(A,B));
	}
}
