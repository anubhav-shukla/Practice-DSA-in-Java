package DSA;

import java.util.Arrays;
// it is in nlogn solution and we need O(n)
public class Threewaypartitioning2 {
    public static void main(String arg[]){
        int arr[] = {1,4,7,8,9,6,4};
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
