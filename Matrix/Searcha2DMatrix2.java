package DSA;

public class Searcha2DMatrix2 {
public static boolean searchMatrix(int[][] matrix, int target) {
        
        int rstart = 0, rend = matrix.length-1, cstart = 0, cend = matrix[0].length-1;
        
        int cmid = cstart + (cend-cstart)/2;    
     
        while(rstart < (rend - 1)){
        int rmid = rstart + (rend-rstart)/2;
            
            if(matrix[rmid][cmid]==target){
                return true;
            }
            else if(matrix[rmid][cmid]>target){
                rend = rmid;
            }
            else{
                rstart = rmid;
            }
        }
        
        if(matrix[rstart][cmid]==target){
            return true;
        }
        else if(matrix[rend][cmid]==target){
            return true;
        }
        else{
            if(binarysearch(matrix, rstart, 0, cmid-1, target))
                return true;
            else if(binarysearch(matrix, rend, 0, cmid-1, target))
                return true;
            else if(binarysearch(matrix, rstart, cmid+1, matrix[0].length-1, target))
                return true;
            else if(binarysearch(matrix, rend, cmid+1, matrix[0].length-1, target))
                return true;
        }
        
        return false;
    }
    
    public static boolean binarysearch(int[][]matrix, int row, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    
    public static void main (String ar[]) {
    	int [][] arr = {{3,4,5,5,3},{2,232,2,2,2},{5,6,77,4,3},{9,7,5,4,3}};
    	int tar = 232;
    	System.out.println(searchMatrix(arr,tar));
    }
}
//Time Complexity : O(log n + log m)


