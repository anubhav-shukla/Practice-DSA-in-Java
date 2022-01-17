package DSA;

public class Counttotalsetbits {
	public static int countSetBits(int n){
	       
	       if(n<=0)
	           return 0;
	       
	       int power = 0;
	       
	       while( (1<<power) <= n ){
	           power++;
	       }
	       power--;
	       
	       int value_power = (int)Math.pow(2,power);
	       int set_till_power =(value_power/2)*power + (n - value_power +1);
	       
	       //System.out.println(power + " "+ set_till_power);
	       
	       return set_till_power + countSetBits(n-value_power);
	   }

	 public static void main(String ar[]) {
		 int N = 17;
		 System.out.println(countSetBits(N));
	 }
}
