package DSA;

import java.util.HashMap;

public class Smallestwindowinastringcontaining {
	   public static String smallestWindow(String s, String p)
	    {
	        if(s.length()<p.length())
	        return "-1";
	        

	        if(s.length()==p.length()){
	            if(s.equals(p))
	            return p;
	            else
	            return "-1";
	        }
	        
	        int n1 = s.length(), n2 = p.length(), count=0;
	        
	        HashMap<Character, Integer> map = new HashMap<>();
	        for(int i=0;i<n1;i++){
	            map.put(s.charAt(i),0);
	        }
	       
	        for(int i=0;i<n2;i++){
	            if(map.containsKey(p.charAt(i))){
	                if(map.get(p.charAt(i))==0)
	                count++;
	                map.put(p.charAt(i), map.get(p.charAt(i))+1);
	            }
	            else
	            return "-1";
	        }

	        int i=0,j=0,start=0,ans=Integer.MAX_VALUE;
	     
	        while(j<n1){
	            map.put(s.charAt(j),map.get(s.charAt(j))-1);
	            
	            if(map.get(s.charAt(j))==0)
	            count--;
	            
	            if(count==0){
	                while(count==0){
	                    
	                    if(ans>j-i+1){
	                        ans = j-i+1;
	                        start=i;
	                    }
	                    
	                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
	                    if(map.get(s.charAt(i))>0)
	                    count++;
	                    i++;
	                }
	            }
	            j++;
	        }
	        if(ans==Integer.MAX_VALUE)
	        return "-1";
	     
	        return s.substring(start, start+ans);
	    }
	   public static void main(String ar[]) {
		   String S = "timetopractice";
			String	   P = "toc";
			System.out.println(smallestWindow(S,P));
	   }
}
