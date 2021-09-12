package DSA;
import java.util.*;
public class NextPermutation {
	public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i + 1] <= nums[i]){
            i--;
        }
        if(i >= 0){
            int j = nums.length -1;
            while ( nums[j] <= nums[i]){
                j--;

            }
            swap(nums, i, j);
                    
        }
        reverse(nums, i+1);
        
    }
    private void reverse(int[] nums, int start){
        int i = start, j = nums.length - 1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1,2,3};
        NextPermutation ob = new NextPermutation();
        ob.nextPermutation(arr);
      System.out.println(Arrays.toString(arr));
	}

}
