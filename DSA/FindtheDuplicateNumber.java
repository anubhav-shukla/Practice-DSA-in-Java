package DSA;
import java.util.*;
public class FindtheDuplicateNumber {
	    public int findDuplicate(int[] nums) {
	    	 Arrays.sort(nums);
	         for (int i = 1; i < nums.length; i++) {
	             if (nums[i] == nums[i-1])
	                 return nums[i];
	         }

	         return -1;
	     }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {5, 67, 89, 78, 89};
      FindtheDuplicateNumber ob = new FindtheDuplicateNumber();
      
      int a = ob.findDuplicate(arr);
      System.out.println(a);
	}

}
