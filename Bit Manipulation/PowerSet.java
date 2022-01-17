package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
	public static List<String> AllPossibleStrings(String s)
	   {
	      
	       List<String>  result=new ArrayList<String>();
	       
	       for(int i=0;i<(1<<s.length());i++){
	           
	           String sunstr="";
	      
	           for(int j=0;j<s.length();j++){
	               
	               if((i&(1<<j))>0)
	               {
	                   sunstr+=s.charAt(j);
	                    
	               }
	              
	           }
	           
	           if(sunstr.length()>0){
	          result.add(sunstr);
	           }
	           
	       }
	       
	       Collections.sort(result);
	       return result;
	   }
	public static void main(String ar[]) {
		String str = "abc";
		System.out.println(AllPossibleStrings(str));
	}
}
