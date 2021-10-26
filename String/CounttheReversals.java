package DSA;

import java.util.Stack;

public class CounttheReversals {
	 static int countRev (String s)
	   {
	       // your code here 
	       Stack<Character> sta= new Stack<>();
	       char[] st= s.toCharArray();
	       int res=0;
	       for(int i=0;i<s.length();i++){
	           if(sta.isEmpty()){
	               sta.push(st[i]);
	           }
	           else if(sta.peek()=='{' && st[i]=='}'){
	               sta.pop();
	           }
	           else{
	               sta.push(st[i]);
	           }
	       }
	       if(sta.isEmpty()){
	           return res;
	       }
	       else{
	           while(!sta.isEmpty()){
	           char a=sta.pop();
	           if(sta.isEmpty()){
	               return -1;
	           }
	           if(sta.peek()=='{' && a=='{' || sta.peek()=='}' && a=='}'){
	               sta.pop();
	               res++;
	           }
	           else if(sta.peek()=='}' && a=='{'){
	               sta.pop();
	               res=res+2;
	           }
	           }
	       }
	       return res;
	   }
	 public static void main(String ar[]) {
		 String S = "}{{}}{{{";
		 System.out.println(countRev(S));
	 }

}
