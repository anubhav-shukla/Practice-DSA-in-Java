package DSA;

import java.util.HashMap;
import java.util.Scanner;

public class Largestarearectangularsubmatrix {
	 static int largestAreaRectangularSubMatrixWithEqualNumberOf1sAnd0s (int[][] matrix, int n, int m){
	        // stores the prefixSum of rows
	        int[][] prefixSum = new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++)
	                prefixSum[i][j] = matrix[i][j];
	        }
	    
	        // calculation prefix sum for each row
	        for(int i=0;i<n;i++){
	            for(int j=1;j<m;j++)
	                prefixSum[i][j] += prefixSum[i][j-1];
	        }
	    
	        int startCol = 0, endCol = 0, startRow = 0, endRow = 0;
	        int maxSize = 0;
	        for(int firstCol=0;firstCol<m;firstCol++){
	            for(int secondCol=firstCol;secondCol<m;secondCol++){
	                int tmp[] = new int[n]; // stores the sum between two columns for each row
	                for(int row=0;row<n;row++)
	                    tmp[row] = prefixSum[row][secondCol] - (firstCol>0 ? prefixSum[row][firstCol-1] : 0);
	                
	                int curSum = 0;
	                HashMap<Integer, Integer> rowSumMap = new HashMap<Integer, Integer>();
	                rowSumMap.put(0,-1);
	                for(int curRow=0;curRow<n;curRow++){
	                    curSum += tmp[curRow];
	                    if(rowSumMap.containsKey(curSum)) {
	                        int subMatrixSize = (secondCol - firstCol + 1)*(curRow - rowSumMap.get(curSum));
	                        if(subMatrixSize > maxSize){
	                            maxSize = subMatrixSize;
	                            startCol = firstCol;
	                            endCol = secondCol;
	                            startRow = rowSumMap.get(curSum) + 1;
	                            endRow = curRow;
	                        }
	                    } else {
	                        rowSumMap.put(curSum,curRow);
	                    }
	                }
	            }
	        }
	        
	        if(maxSize == 0){
	            System.out.println("There exists no sub-matrix with equal number of 1s and 0s");
	            return 0;
	        }
	        System.out.println("Largest Rectangular Sub-matrix with equal number of 1s and 0s");
	        for(int i=startRow;i<=endRow;i++){
	            for(int j=startCol;j<=endCol;j++){
	                System.out.print((matrix[i][j]>0) ? "1 " : "0 ");
	            }
	            System.out.println();
	        }
	        return maxSize;
	    }
	    
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- > 0){
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	            int matrix[][] = new int[n][m];
	            for(int i=0;i<n;i++){
	                for(int j=0;j<m;j++){
	                    matrix[i][j] = sc.nextInt();
	                    matrix[i][j] = matrix[i][j]>0 ? 1 : -1;
	                }
	            }
	            int ans = largestAreaRectangularSubMatrixWithEqualNumberOf1sAnd0s (matrix, n, m);
	            if(ans != 0)
	            System.out.println(ans);
	        }
	    }
	    /*
	     * sample input
1
4 4
1 1 1 1
0 1 0 1
1 0 1 0
1 0 0 0
	     */
	
}
