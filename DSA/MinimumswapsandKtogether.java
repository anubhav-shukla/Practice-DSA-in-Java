package DSA;

public class MinimumswapsandKtogether {
    public static int minSwap (int arr[], int n, int k) {
        int count=0,nonfav=0,result=Integer.MAX_VALUE;
        for(int o:arr){
            if(o<=k) count++;
        }
        int i=0,j=count-1;
        while(j<n){
            for(int l=i;l<=j;l++){
                if(arr[l]>k) nonfav++;
            }
            result=Math.min(result,nonfav);
            nonfav=0;
            j++;i++;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String ar[]){
        int arr[ ] = {2, 7, 9, 5, 8, 7, 4};
        int K = 6;
        int n=arr.length;
        minSwap(arr,n,K);
    }
}
