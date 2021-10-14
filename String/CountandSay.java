package DSA;

public class CountandSay {
	public static String countAndSay(int n) {
	      
        if(n == 1){
            return "1";
        }
        String res = say(countAndSay(n-1));
        return res;
    }
    
    public static String say(String s){
        StringBuilder res = new StringBuilder();
        char currChar = s.charAt(0);
        int charCount = 1;
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == currChar){
                charCount++;
            }else{
                res.append(String.valueOf(charCount)+ currChar);
                currChar = s.charAt(i);
                charCount = 1;
            }
        }
        res.append(String.valueOf(charCount)+ currChar);
        return res.toString();
    }
    public static void main(String ar[]) {
    	 int n = 4;
    	 System.out.println(countAndSay(n));
    }
}
