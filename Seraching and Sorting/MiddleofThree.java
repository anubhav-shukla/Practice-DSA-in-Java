package DSA;
import java.util.*;
public class MiddleofThree {
static int middle(int A, int B, int C) {
	int[] arr = new int[3];
	arr[0] = A;
	arr[1] = B;
	arr[2] = C;
	Arrays.sort(arr);
	return arr[1];
}
public static void main(String ar[]) {
	int A=4,B=8,C=10;
	System.out.println(middle(A,B,C));
}
}
