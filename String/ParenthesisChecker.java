package DSA;

import java.util.Stack;

public class ParenthesisChecker {
	public static boolean ispar(String x) {

	       char[] arr = x.toCharArray();
	       Stack<Character> stack = new Stack<>();

	       for (int i = 0; i < arr.length; i++) {
	           if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
	               stack.push(arr[i]);
	           }
	           if (stack.isEmpty()) return false;

	           char temp;
	           switch (arr[i]) {
	               case ')':
	                   temp = stack.pop();
	                   if (temp == '[' || temp == '{') return false;
	                   break;
	               case '}':
	                   temp = stack.pop();
	                   if (temp == '(' || temp == '[') return false;
	                   break;
	               case ']':
	                   temp = stack.pop();
	                   if (temp == '(' || temp == '{') return false;
	                   break;
	           }

	       }

	       return stack.isEmpty();
	   }
	public static void main(String ar[]) {
		String s= "()";
		
		System.out.println(ispar(s));
	}
}
