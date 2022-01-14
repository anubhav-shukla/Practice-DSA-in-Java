package DSA;

public class Largestsquareformedinamatrix {
	 static int maxSquare(int n, int m, int matrix[][]){


	       int aux[][]= new int[n][m];
	       int max=0;
	       
	       for(int i=0; i<m; i++){
	           if(matrix[0][i]==1){
	               aux[0][i]= 1;
	               max=1;
	           }
	           
	       }
	       for(int i=0; i<n; i++){
	           if(matrix[i][0]==1){
	               aux[i][0]= 1;
	               max=1;
	           }
	       }
	       
	       for(int i=1; i<n; i++){
	           for(int j=1; j<m; j++){
	               if(matrix[i][j]==1){
	                   aux[i][j]= Math.min(aux[i-1][j], Math.min(aux[i][j-1],aux[i-1][j-1]))+1;
	               }else{
	                   aux[i][j]=0;
	               }
	               max=Math.max(max,aux[i][j]);
	           }
	       }
	       return max;
	   }
public static void main(String ar[]) {
	int n = 2, m = 2;
		int[][]	mat = {{1, 1}, {1, 1}};
	System.out.println(maxSquare(n,m,mat));
}
}