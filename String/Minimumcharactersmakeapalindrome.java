package DSA;

public class Minimumcharactersmakeapalindrome {
	 static boolean ispalindrome(String s) {
	        int l = s.length();
	 
	        for (int i = 0, j = l - 1; i <= j; i++, j--) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String s = "BABABAA";
	        int cnt = 0;
	        int flag = 0;
	 
	        while (s.length() > 0) {
	          
	            if (ispalindrome(s)) {
	                flag = 1;
	                break;
	            } else {
	                cnt++;
	 
	                
	                s = s.substring(0, s.length() - 1);
	              
	            }
	        }
	 
	        
	        if (flag == 1) {
	            System.out.println(cnt);
	        }
	    }
	
}
