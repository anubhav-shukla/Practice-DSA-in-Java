package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortbySetBitCount {
	public static void main(String[] args)
    {   Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = 6;
        sortBySetBitCount(arr, n);
        printArr(arr, n);
        System.out.println();
    }
 
    private static void printArr(Integer[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    private static Integer[] sortBySetBitCount(
        Integer[] arr, int n)
    {
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1)
            {
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                    return -1;
            }
        });
        return arr;
    }
}
