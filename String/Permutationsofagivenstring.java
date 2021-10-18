package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutationsofagivenstring {
	public static void permutation(String rem,List<String> list, String str) {
	       if(rem == null) return;
	       
	       if(rem.length() == 0) {
	           list.add(str);
	       }
	       
	       for(int i=0; i<rem.length(); i++) {
	           String newC = str + rem.charAt(i);
	           String newR = rem.substring(0,i)+rem.substring(i+1);
	           permutation(newR,list, newC);
	       }
	   }
	   
	   public List<String> find_permutation(String S) {
	       String ans="";
	       List<String> list = new ArrayList<>();
	       permutation(S,list,ans);
	       Collections.sort(list);
	       return list;
	   }
	   public static void main(String ar[]) {
	
	   }
}
