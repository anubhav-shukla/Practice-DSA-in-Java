package DSA;

import java.lang.module.ResolutionException;
import java.util.Arrays;

public class Medianoftwosortedarraysofdifferentsizes {
    public static int solution(int arr[]){
        int n = arr.length;
        if(n%2 ==0){
            int z=n/2;
            int e =arr[z];
            int q = arr[z-1];
            int ans = (e+q)/2;
            return ans;
        }
        else{
            int z=Math.round(n/2);
            return arr[z];
        }
    }
    public static void main(String ary[])
    {
        int [] ae = {2, 3, 5, 8 };
        int ar[] = {10, 12, 14, 16, 18, 20};
        int i=ae.length;
        int j = ar.length;

        int [] arr3 = new int[i+j];
        System.arraycopy(ae, 0, arr3, 0, i);
        System.arraycopy(ar, 0, arr3, i, j);
        Arrays.sort(arr3);
        System.out.println("Median = " + solution(arr3));
    }
}
