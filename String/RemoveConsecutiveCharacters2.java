package DSA;

public class RemoveConsecutiveCharacters2 {
	
	    public static String removeConsecutiveCharacter(String s){
	        int n = s.length();
	        
	        int i;
	        String res = "";
	        
	        char[] ch = s.toCharArray();
	        
	        for(i=0;i<n;i++){
	            if(i!=n-1 && ch[i] != ch[i+1])
	                res += ch[i];
	        }
	        res += ch[i-1];
	        return res;
	    }
	    public static void main(String ar[]) {
		    String	S = "aabb";

		    	System.out.println(removeConsecutiveCharacter(S));
		    }

	}
