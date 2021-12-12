package DSA;
import java.util.*;
public class WordBreakPart2 {
	  static void wordBreak(int n, List<String> dict, String s)
	  {
	    String ans="";
	    wordBreakUtil(n, s, dict, ans);
	  }
	 
	  static void wordBreakUtil(int n, String s, List<String> dict, String ans)
	  {
	    for(int i = 1; i <= n; i++)
	    {
	 
	      String prefix=s.substring(0, i);
	      if(dict.contains(prefix))
	      {
	        if(i == n)
	        {
	          ans += prefix;
	          System.out.println(ans);
	          return;
	        }
	        wordBreakUtil(n - i, s.substring(i,n), dict, ans+prefix+" ");
	      }
	    }
	  }
	  public static void main(String args[])
	  {
	    String str1 = "iloveicecreamandmango"; // for first test case
	    String str2 ="ilovesamsungmobile";     // for second test case
	    int n1 = str1.length();                 // length of first string
	    int n2 = str2.length();                 // length of second string
	    List <String> dict= Arrays.asList("mobile","samsung","sam","sung",
	                                      "man","mango", "icecream","and",
	                                      "go","i","love","ice","cream");        
	    System.out.println("First Test:");
	    wordBreak(n1,dict,str1);
	    System.out.println("\nSecond Test:");
	 
	    // call to the method
	    wordBreak(n2,dict,str2);
	  }
	
}
