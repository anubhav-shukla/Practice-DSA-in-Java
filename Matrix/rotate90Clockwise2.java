package DSA;

public class rotate90Clockwise2 {
	static void rotate(int[][] arr)
    {
 
        int n = arr.length;
 
        // first rotation
        // with respect to Secondary diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][n - 1 - i];
                arr[n - 1 - j][n - 1 - i] = temp;
            }
        }
        // Second rotation
        // with respect to middle row
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - i][j];
                arr[n - 1 - i][j] = temp;
            }
        }
    }
 
    // to print matrix
    static void printMatrix(int arr[][])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    // Driver code
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        rotate(arr);
        printMatrix(arr);
    }

}
