package DSA;
import java.util.*;
import java.io.*;

public class negativenumberstobeginningandpositivetoend {
	static void rearrange(int arr[]) {
	int j = 0 , temp;
	for (int i =0;i<arr.length;i++) {
		if(arr[i]<0) {
			if(i != j) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
				
			}
			j++;
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,9,-8,3,4,-89,99,-88};
		rearrange(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]); 
		}
	}

}
