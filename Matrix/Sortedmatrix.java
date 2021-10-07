package DSA;

import java.util.Arrays;

public class Sortedmatrix {
	 static int[][] sortedMatrix(int N, int Mat[][]) {
	        // code here
	        int result[][] = new int[N][N];
	        int arr[] = new int[N*N];
	        int x=0;
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++){
	                arr[x++] = Mat[i][j];
	            }
	        }
	        int k=0;
	        Arrays.sort(arr);
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++){
	                Mat[i][j] = arr[k++];
	            }
	        }
	        return Mat;
	    
	}
	 public static void main(String [] args) {
		int  N=4;
				 int [][] Mat= {{10,20,30,40},
				 {15,25,35,45}, 
				 {27,29,37,48} ,
				 {32,33,39,50}};
				 
				  System.out.println("Matrix After Sorting:");
				  sortedMatrix(N, Mat);
				  for (int i = 0; i < N; i++) {
			            for (int j = 0; j < N; j++)
			                System.out.print( Mat[i][j] + " ");
			            System.out.println();
			        }
			    
	 }
}
