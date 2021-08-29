package DSA;

public class ReverseArray2 {
static void reverseArray(int arr[],int start,int end) {
	int temp;
	while(start<end) {
		temp=arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}
}
static void printArray(int arr[],
        int size)
{
for (int i = 0; i < size; i++)
System.out.print(arr[i] + " ");

System.out.println();
}
public static void main(String[] arg) {
	int arr[] = {1,3,5,6,7,8 };
	printArray(arr,6);
	
	reverseArray(arr,0,5);
	System.out.print("Revesred array is \n");
	printArray(arr,6);
	
}
}
