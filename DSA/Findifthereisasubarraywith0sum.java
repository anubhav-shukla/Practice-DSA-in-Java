package DSA;
import java.util.*;
public class Findifthereisasubarraywith0sum {
    static Boolean subArrayE(int arr[]) {
    	Set<Integer> hs = new HashSet<Integer>();
    	int sum =0;
    	for(int i =0; i<arr.length;i++) {
    		sum += arr[i];
    		if(arr[i] == 0 || sum == 0 || hs.contains(sum))
    			return true;
    		hs.add(sum);
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3, 2, 3, 1, 6};
		if(subArrayE(arr)) {
			System.out.println("True");
		}
		System.out.println("False");
			
        
	}

}
