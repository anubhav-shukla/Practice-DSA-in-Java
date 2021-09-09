package DSA;
import java.util.*;
public class FindtheDuplicateNumber2 {
	  public int findDuplicate(int[] nums) {
	        Set<Integer> seen = new HashSet<Integer>();
	        for (int num : nums) {
	            if (seen.contains(num))
	                return num;
	            seen.add(num);
	        }
	        return -1;
	    }
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,24,5,7,8,5};
		FindtheDuplicateNumber2 ob= new FindtheDuplicateNumber2();
		
		int a=ob.findDuplicate(arr);
		System.out.println(a);
	}

}
