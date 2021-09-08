package DSA;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Minimumnumberofjumps {
    static int minjumps(int[] arr) {
    	int n =arr.length;
    	int counter =0;
    	int step = arr[0];
    	int result = 0;
    	
    	for(int i =0;i<n;i++) {
    		if(step>=n-1) {
    			break;
    		}
    		if(step<i) {
    			return -1;
    			
    		}
    		result = Math.max(result, arr[i]+1);
    		if(step ==i) {
    			step = result;
    			result =0;
    			counter += 1;
    		}
    	}
    	return counter;
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      int ar[] = {1,3,5,8,9,2,6,7,6,8,9};
//      Minimumnumberofjumps ob = new Minimumnumberofjumps();
//      ob.minjumps[ar];
      int a = minjumps(ar);
      System.out.println(a);

}
}