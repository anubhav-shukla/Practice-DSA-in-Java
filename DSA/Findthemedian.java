package DSA;

import java.util.Arrays;

public class Findthemedian {
    public int find_median(int[] v){
        Arrays.sort(v);
        int n = v.length;
        if(n/2 != 0){
            return v[n/2];
        }
        else{
           int  mid1 = v[n/2];
           int mid2 = v[n/2-1];
           return (mid1+mid2)/2;
        }
    }
    public  void main(String arg[]){
        int a[] = {3,4,5,6,7,8};
        find_median(a);

    }
}
