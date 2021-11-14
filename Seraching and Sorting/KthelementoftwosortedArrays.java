package DSA;

public class KthelementoftwosortedArrays {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0,j=0, count = 0,element;
        while(count < k){
            if(i>=n) return (long)arr2[j+k-count-1];
            if(j>=m) return (long)arr1[i+k-count-1];
            if(arr1[i]<arr2[j]) element = arr1[i++];
            else element = arr2[j++];
            count++;
            if(count == k) return (long)element;
        }
        return 0L;
    }
    public static void main(String ar[]) {
    	
    	int arr1[] = {2, 3, 6, 7, 9};
    	int arr2[] = {1, 4, 8, 10};
    	int k = 5;
    	int n=arr1.length;
    	int m = arr2.length;
    	System.out.println(kthElement(arr1,arr2,n,m,k));
    }
}
