package DSA;

public class CountSquares {
 static int countSquare(int N) {
	int count =0;
	for(int i=1;i<N;i++) {
		if(i*i>=N) {
			break;
		}
		else {
			count++;
		}
		
	}
	return count;
}
public static void main(String ar[]) {
	int a =9;
	
	System.out.println(countSquare(a));
}
}
