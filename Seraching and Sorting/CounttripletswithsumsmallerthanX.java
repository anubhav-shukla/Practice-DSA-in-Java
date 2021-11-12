package DSA;

import java.util.Arrays;

public class CounttripletswithsumsmallerthanX {
	static long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long res = 0;
        for(int i = 0; i < n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                if(arr[i] + arr[j] + arr[k] < sum){
                    res += (k - j);
                    j = j + 1;
                }
                else if(arr[i] + arr[j] + arr[k] >= sum){
                    k--;
                }
            }
        }
        return res;
    }
	public static void main(String ar[]) {
		int N = 4, sum = 2;
			long	arr[] = {-2, 0, 1, 3};
		System.out.println(countTriplets(arr,N,sum));
	}
	
}
