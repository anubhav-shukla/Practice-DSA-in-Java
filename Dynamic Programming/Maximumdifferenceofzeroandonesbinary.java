package DSA;

public class Maximumdifferenceofzeroandonesbinary {
	static int maxSubstring(String S) {
        // code here
        int maxDifference = -1, currentCount = 0;
        for (int i = 0; i < S.length(); i++) {
            int number = Integer.parseInt(S.charAt(i) + "");
            if (currentCount < 0) currentCount = 0;
            if (number == 0) currentCount++;
            else currentCount--;
            if (currentCount > maxDifference) maxDifference = currentCount;
        }
        return maxDifference;
    }
	public static void main(String ar[]) {
	String	S = "11000010001" ;
		System.out.println(maxSubstring(S));
	}
}
