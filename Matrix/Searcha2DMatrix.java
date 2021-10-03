package DSA;

public class Searcha2DMatrix {
     public static boolean serachMatrix(int[][] matrix, int target) {
    	 if(matrix.length == 0) return false;
    	 
    	 int n = matrix.length;
    	 int m = matrix.length;
    	 
    	 int lo =0;
    	 int hi = (n*m)-1;
    	 
    	 while(lo<=hi) {
    		 int mid = (lo + (hi - lo)/2);
    		 if(matrix[mid/m][mid % m] == target) {
    			 return true;
    		 }
    		 if(matrix[mid/m][mid%m]<target) {
    			 lo = mid +1;
    		 }
    		 else {
    			 hi = mid+1;
    		 }
    	 }
    	 return false;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		System.out.println(serachMatrix(matrix,target));
	}

}
