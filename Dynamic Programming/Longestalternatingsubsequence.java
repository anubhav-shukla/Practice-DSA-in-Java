package DSA;

public class Longestalternatingsubsequence {
	public static int AlternatingaMaxLength(int[] nums)
	{
	int increasing = 1;
	int decreasing = 1;
	int n = nums.length;
	for(int i = 1 ; i < n ; i++){
	if(nums[i] > nums[i-1]){
	increasing = decreasing + 1;
	}
	else if (nums[i] < nums[i-1]){
	decreasing = increasing + 1;
	}
	}
	return Math.max( increasing , decreasing);
	}
	public static void main(String ar[]) {
		int nums[] = {1,5,4};
		System.out.println(AlternatingaMaxLength(nums));
	}
}
