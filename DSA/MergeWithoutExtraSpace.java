package DSA;
import java.util.*;
public class MergeWithoutExtraSpace {

	public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
      int i = n-1,j = 0;
        while(i >= 0  && j < m && arr1[i] > arr2[j]){
            int temp = arr1[i];
            arr1[i--] = arr2[j];
            arr2[j++] = temp;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

public static void main(String[] args)
{
  

    int[] a1 = { 10, 27, 38, 43, 82 };
    int[] a2 = { 3, 9 };

    // Function Call
     merge(a1, a2, a1.length, a2.length);

    System.out.print("First Array: ");
    for (int i = 0; i < a1.length; i++) {
        System.out.print(a1[i] + " ");
    }

    System.out.println();

    System.out.print("Second Array: ");
    for (int i = 0; i < a2.length; i++) {
        System.out.print(a2[i] + " ");
    }
}
}
