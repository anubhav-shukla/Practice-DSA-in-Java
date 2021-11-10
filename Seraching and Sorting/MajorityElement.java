package DSA;

public class MajorityElement {
	static int majorityElement(int a[], int size)
    {
        // your code here
        int hash[]= new int[10000001];
       for(int i=0; i< size; i++)
       {
           hash[a[i]]++;
       }
       for(int j=0; j<10000001; j++)
       {
           if(hash[j]>size/2)
               return j;
       }
       return -1;
    }
	public static void main(String ar[]) {
		int size=3 ;
		int a[] = {1,2,3};
		System.out.println(majorityElement(a,size));
	}
}
