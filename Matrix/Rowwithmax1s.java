package DSA;

public class Rowwithmax1s {
	static int rowWithMax1s(int arr[][], int n, int m) {
	       int row = 0;
	       int col = m-1;
	       int res = -1;
	       while(row<n && col>=0){
	           if(arr[row][col]==1){
	               res = row;
	               col--;
	               continue;    
	           }
	           row++;
	       }
	      
	       return res;
	   }
	public static void main(String args[]) {
		int N = 4 , M = 4;
			int 	Arr[][] = {{0, 1, 1, 1},
				           {0, 0, 1, 1},
				           {1, 1, 1, 1},
				           {0, 0, 0, 0}};
			System.out.println(rowWithMax1s(Arr,N,M));
	}
}
