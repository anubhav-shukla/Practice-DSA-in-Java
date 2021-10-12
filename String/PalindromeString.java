package DSA;

public class PalindromeString {
 static int isPalindrome(String s) {
	 StringBuilder sb = new StringBuilder(s);
	 
	 if(s.equals(sb.reverse().toString()))
		 return 1;
	 return 0;
 }
 public static void main(String ar[]) {
	 String s= "aba";
	 
	 System.out.println(isPalindrome(s));
 }
}
