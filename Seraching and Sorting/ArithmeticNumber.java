package DSA;

public class ArithmeticNumber {
	static int inSequence(int A, int B, int C){
        // code here
        if(C==0 && A == B) return 1;
        double n = (double)(B-A)/C +1;
        if(n%1==0 && n>0){
            return 1;
        }
        return 0;
    }
	public static void main(String ar[]) {
		int A = 1, B = 3, C = 2;
		System.out.println(inSequence(A,B,C));
	}
}
