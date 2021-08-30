package DSA;

public class FindmaxAndMinArray {
	static void sort(int arr[]) {
		int a = arr.length;
		for(int i=0;i<a-1;i++) {
			int min=i;
			for(int j = i+1;j<a;j++) {
				if(arr[j]<arr[min]) {
					min=j;
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
				}
			}
		}
				
	}

	public static void main(String[] args) {
		int[] arr = {8,3,4,5,9};
		sort(arr);
		int p = arr[0];
		int q= arr[arr.length-1];
		System.out.println(p);
		System.out.println(q);
		
		
         

}
}