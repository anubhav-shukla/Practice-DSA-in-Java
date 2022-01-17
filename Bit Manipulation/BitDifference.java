package DSA;

public class BitDifference {
	 public static int countBitsFlip(int a, int b)
	   {
	       int z=a^b;
	       int count=0;
	       while(z!=0)
	       {
	           if((z&1)==1)
	           {
	               count++;
	           }
	           z=z>>1;
	       }
	       return count;
	
	       
	   }
	 public static void main(String ar[]) {
		 int A = 20, B = 25;
		 System.out.println(countBitsFlip(A,B));
	 }
}
