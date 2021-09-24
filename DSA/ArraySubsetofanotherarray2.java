package DSA;

import java.util.HashMap;

public class ArraySubsetofanotherarray2 {
	static boolean isSubset(int[] arr1, int m, 
            int[] arr2, int n)
{

// Create a Frequency Table using STL
HashMap<Integer, 
Integer> frequency = new HashMap<Integer, 
                                 Integer>();

// Increase the frequency of each element
// in the frequency table.
for(int i = 0; i < m; i++) 
{
frequency.put(arr1[i],
          frequency.getOrDefault(
              arr1[i], 0) + 1);
}

// Decrease the frequency if the
// element was found in the frequency
// table with the frequency more than 0.
// else return 0 and if loop is
// completed return 1.
for(int i = 0; i < n; i++) 
{
if (frequency.getOrDefault(arr2[i], 0) > 0)
frequency.put(arr2[i],
              frequency.get(arr1[i]) - 1);
else
{
return false;
}
}
return true;
}

//Driver Code
public static void main(String[] args)
{
int[] arr1 = { 11, 1, 13, 21, 3, 7 };
int[] arr2 = { 11, 3, 7, 1 };

int m = arr1.length;
int n = arr2.length;

if (isSubset(arr1, m, arr2, n))
System.out.println(
"arr2[] is subset of arr1[] ");
else
System.out.println(
"arr2[] is not a subset of arr1[] ");
}

}
