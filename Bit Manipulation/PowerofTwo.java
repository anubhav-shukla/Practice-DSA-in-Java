package DSA;

public class PowerofTwo {
	 public static boolean isPowerofTwo(long n){
	        
	        int count = 0;
	        
	        while(n>0){
	            n = (n&n-1);
	            count++;
	        }
	        
	        if(count != 1){
	            return false;
	        }
	        
	        return true;
	    }
	    
	public static void main(String ar[]) {
		int N = 98;
		System.out.println(isPowerofTwo(N));
	}
}
