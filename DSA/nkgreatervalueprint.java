package DSA;
import java.util.*;
public class nkgreatervalueprint {
	static class eleCount{
		int e;
		int c;
	};
	static void morethanndk(int arr[],int n, int k) {
		if(k<2)
			return;
		eleCount []temp= new eleCount[k-1];
		for(int i =0;i<k-1;i++)
			temp[i] = new eleCount();
		for (int i =0;i<k-1;i++) {
			temp[i].c = 0;
		}
		
		for(int i =0;i<n;i++) {
			int j;
			for(j = 0;j<k-1;j++) {
				if(temp[j].e== arr[i]) {
					temp[j].c += 1;
					break;
				}
			}
			if(j == k-1) {
				int l;
				for(l=0;l<k-1;l++) {
					if(temp[l].c == 0) {
						temp[l].e = arr[i];
						temp[l].c = 1;
						break;
						
					}
				}
				if(l ==k-1)
					for(l=0;l<k-1;l++)
						temp[l].c -= 1;
				
			}
		}
		for(int i=0;i<k-1;i++) {
			int ac =0;
			for(int j =0;j<n;j++)
				if(arr[j] == temp[i].e)
					ac++;
			if(ac>n/k)
				System.out.println("Number:"+ temp[i].e+"Count"+ac+"\n");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Test\n");
		int arr1[] = {4,5,6,7,8,4,4};
		int size = arr1.length;
		int k =3;
		morethanndk(arr1,size,k);
			}

}