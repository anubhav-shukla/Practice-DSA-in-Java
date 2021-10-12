package DSA;

public class PalindromeString2 {
	static int isPalindrome(String str) {
	       // code here
	       String nw="";
	       for(int i=0;i<str.length();i++){
	       char ch=str.charAt(i);
	           nw=ch+nw;}
	       if(nw.equalsIgnoreCase(str)) return 1;
	       else  return 0; }
	public static void main(String ar[]) {
		String k = "abc";
		System.out.println(isPalindrome(k));
	}
	
	 
}
