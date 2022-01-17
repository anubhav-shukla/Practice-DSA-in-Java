package DSA;

public class NumberofBits {
	static int setBits(int N) {
	       String s=Integer.toBinaryString(N);
	       
	       int count=0;
	       for(int i=0;i<s.length();i++){
	           if(s.charAt(i)=='1')
	           count++;
	       }
	       return count;
	   }
	public static void main(String ar[]) {
		System.out.println(setBits(8));
	}
}
