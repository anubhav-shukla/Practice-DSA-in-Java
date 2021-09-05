package DSA;

public class Cyclically_rotate_an_array_by_one {
     static void cyclical_ro(int arr[],int n) {
    	 System.out.print(arr[n-1]+" ");
    	 for(int i=0;i<n-1;i++) {
    		 System.out.print(arr[i]+" ");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {1,2,45,6,7,8};
      cyclical_ro(a,6);
	}

}
