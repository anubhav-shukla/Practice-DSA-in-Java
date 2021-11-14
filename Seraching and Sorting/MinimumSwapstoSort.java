package DSA;

import java.util.Arrays;

public class MinimumSwapstoSort {
	public static int minSwaps(int nums[])
    {
        int arr[]=new int[nums.length];
        int count=0,j=0,unCount=0;
        
        for(int i:nums)
        arr[j++]=i;
        
        Arrays.sort(arr);
        int i=0;
        while(!Arrays.equals(arr,nums))
        {
            if(i==nums.length)
            i=0;
            if(nums[i]!=arr[i])
            {
                int index=Arrays.binarySearch(arr,nums[i]);
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                count++;
            }
            i++;
        }
        return count;
    }
	public static void main(String ar[]) {
    int		nums[] = {2, 8, 5, 4};
    System.out.println(minSwaps(nums));
	}
}
