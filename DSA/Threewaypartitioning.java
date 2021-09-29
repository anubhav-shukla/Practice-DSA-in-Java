package DSA;
// this is code of GFG
public class Threewaypartitioning {
    public static void threeWayPartition(int[] arr, int lowVal, int highVal)
    {

        int  n = arr.length;

        // Initialize ext available positions for
        // smaller (than range) and greater lements
        int start = 0, end = n-1;

        // Traverse elements from left
        for(int i = 0; i <= end;)
        {

            // If current element is smaller than
            // range, put it on next available smaller
            // position.

            if(arr[i] < lowVal)
            {

                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;

            }

            // If current element is greater than
            // range, put it on next available greater
            // position.
            else if(arr[i] > highVal)
            {

                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            }

            else
                i++;
        }

    }

    public static void main (String[] args)
    {


        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};

        threeWayPartition(arr, 10, 20);

        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }
    }

}
