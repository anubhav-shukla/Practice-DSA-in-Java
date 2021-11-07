package DSA;

import java.util.ArrayList;

public class Valueequaltoindexvalue {

	
	static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
          ArrayList<Integer> sameIndexValue =new ArrayList<Integer>();
    for (int i=0;i<n;i++){
            if (i +1== arr[i])
                sameIndexValue.add(arr[i]);
    }
    return sameIndexValue;

    }
	public static void main(String ar[]) {
		 int N = 5;
	   int Arr[] = {15, 2, 45, 12, 7};

		System.out.println(valueEqualToIndex(Arr,N));
	}
}
