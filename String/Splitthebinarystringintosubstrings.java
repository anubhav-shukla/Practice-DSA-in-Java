package DSA;

public class Splitthebinarystringintosubstrings {
    static int maxSubs(String str, int n) {
    	int count0=0,count1=0;
    	int cnt =0;
    	for(int i=0;i<n;i++) {
    		if(str.charAt(i)=='0') {
    			count0++;
    		}
    		else {
    			count1++;
    			
    		}
    		if(count0 == count1) {
    			cnt++;
    		}
    	}
    	if(cnt == 0) {
    		return -1;
    	}
		return cnt;
    	
    }
    public static void main(String [] args) {
    	String str = "0100110101";
    	int n = str.length();
    	System.out.println(maxSubs(str,n));
    }
}
