package DSA;
import java.util.HashSet;
public class uniontwoarray2 {
	static void printUnion(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
 
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs.size());
    }
	

public static void main(String[] args)
{
    int arr1[] = { 7, 1, 5, 2, 3, 6 };
    int arr2[] = { 3, 8, 6, 20, 7 };

    // Function call
    System.out.println("Union of two arrays is : ");
    printUnion(arr1, arr2);}}