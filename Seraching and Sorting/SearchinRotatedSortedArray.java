package DSA;

public class SearchinRotatedSortedArray {
	public static int search(int[] nums, int target) {
        int value = -1;
        if(nums[nums.length - 1] == target) {
            return nums.length - 1;
        }
        if(nums[nums.length - 1] > target) {
            int i = nums.length - 2;
            while(i >= 0) {
                if(nums[i] == target) {
                    return i;
                }
                i--;
            }
        }
        if(nums[nums.length - 1] < target) {
            int i = 0;
            while(i < nums.length) {
                if(nums[i] == target) {
                    return i;
                }
                i++;
            }
        }        
        return -1;     
    }
  public static void main(String ar[]) {
	  int nums[] = {4,5,6,7,0,1,2}, target = 0;
	  System.out.println(search(nums,target));
  }
}
