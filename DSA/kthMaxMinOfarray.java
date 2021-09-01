package DSA;

public class kthMaxMinOfarray {
	void sort(int arr[],int m)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(arr[m-1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthMaxMinOfarray ob = new kthMaxMinOfarray();
       int arr[] = {8,2,6,5,9};
       ob.sort(arr,3);
       
       
       
      
    
	}

}
