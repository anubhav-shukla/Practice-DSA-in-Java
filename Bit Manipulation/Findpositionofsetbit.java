package DSA;

public class Findpositionofsetbit {
	 static int findPosition(int N) {
	      
	        return (N==0 || (N&(N-1))!=0)? -1:(int)(Math.log(N)/Math.log(2))+1;
	    }
	 public static void main(String ar[]) {
		 System.out.println(findPosition(5));
	 }
}
