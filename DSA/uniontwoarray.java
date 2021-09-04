package DSA;
import java.io.*;
import java.util.*;
public class uniontwoarray {
	static void printUnion(int[] a, int n,
            int[] b, int m)
{
Map<Integer,
Integer> mp = new HashMap<Integer,
                       Integer>();


for(int i = 0; i < n; i++)
{
mp.put(a[i], i);
}
for(int i = 0; i < m; i++)
{
mp.put(b[i], i);
}

System.out.println("The union set of both arrays is :");
for(Map.Entry mapElement : mp.entrySet())
{
//System.out.print(mapElement.getKey() + " ");
	
}
System.out.println(mp.size());
}
	   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,8,10,77};
		int arrr[]= {1,12};
		printUnion(arr,8,arrr,2);
      
	}

}
