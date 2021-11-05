package DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean areIsomorphic(String str1,String str2)
    {
        int n = str1.length();
        int m = str2.length();
        
        if(n!=m)
            return false;
        HashMap<Character, Character> hs = new HashMap<>();
        
        ArrayList<Character> ar = new ArrayList<>();
        int i,j;
        
        for(i=0;i<n;i++){
            if(!hs.containsKey(str1.charAt(i))){
                if(!ar.contains(str2.charAt(i))){
                    hs.put(str1.charAt(i), str2.charAt(i));
                    ar.add(str2.charAt(i));
                }
                else
                    return false;
            }
            else if(hs.get(str1.charAt(i)) !=  str2.charAt(i))
                return false;
        }
        
        return true;
        
    }
	public static void main (String ar[]) {
	  String	str1 = "aab";
	  String  str2 = "xxy";
	  System.out.println(areIsomorphic(str1,str2));

	}
}
