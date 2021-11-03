package DSA;

public class RemoveConsecutiveCharacters {
	
	    public static String removeConsecutiveCharacter(String S){
	        
	        String ans="";
	        for(int i=0;i<S.length()-1;i++)
	            if(S.charAt(i)==S.charAt(i+1))
	                  S=S.substring(0,i)+"-"+S.substring(i+1);
	        for(String i:S.split("-"))
	        ans+=i;
	        
	        return ans;
	    }
	    public static void main(String ar[]) {
	    String	S = "aabb";

	    	System.out.println(removeConsecutiveCharacter(S));
	    }
	}

