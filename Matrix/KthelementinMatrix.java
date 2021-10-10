package DSA;

import java.util.Arrays;

public class KthelementinMatrix {
	static int smallestfinder(int[][]mat,int n,int k) {
		int arr[]=new int[n*n];
		int size=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[size++]=mat[i][j];
		Arrays.sort(arr);
		return(arr[k-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=4;
		int mat[][] =     {{16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94 }};
		System.out.println(smallestfinder(mat,n,k));

	}

}
