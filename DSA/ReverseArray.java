package DSA;

public class ReverseArray {
	static void rvereseArray(int arr[])
	{
          for(int i =1 ; i<=arr.length;i++) {
			
			int a = arr.length-i;
			System.out.print(arr[a]);
	}
}
	
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4};
//		for(int i =1 ; i<=arr.length;i++) {
//			
//			int a = arr.length-i;
//			System.out.print(arr[a]);
//			}
//		}
//		System.out.print(arr[0]);
	
		int arr[] = {1,2,3,4};
        rvereseArray(arr);
	}
}

