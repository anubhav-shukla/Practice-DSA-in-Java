package DSA;
import java.util.*;
public class Expressioncontainsredundantbracket {
	 static boolean checkRedundancy(String s) {
	       
	        Stack<Character> st = new Stack<>();
	        char[] str = s.toCharArray();
	       
	        for (char ch : str) {
	 
	            if (ch == ')') {
	                char top = st.peek();
	                st.pop();
	 
	                boolean flag = true;
	 
	                while (top != '(') {
	 
	                    if (top == '+' || top == '-'
	                            || top == '*' || top == '/') {
	                        flag = false;
	                    }
	 
	                    top = st.peek();
	                    st.pop();
	                }

	                if (flag == true) {
	                    return true;
	                }
	            } else {
	                st.push(ch); 
	            }               
	        }
	        return false;
	    }
	 
	    static void findRedundant(String str) {
	        boolean ans = checkRedundancy(str);
	        if (ans == true) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
	 
	    public static void main(String[] args) {
	        String str = "((a+b))";
	        findRedundant(str);
	 
	        str = "(a+(b)/c)";
	        findRedundant(str);
	 
	        str = "(a+b*(c-d))";
	        findRedundant(str);
	    }
	
}
