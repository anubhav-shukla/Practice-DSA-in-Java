package DSA;

public class LongestCommonSubstring {
	static int longestCommonSubstr(String S1, String S2, int n, int m){
	       int result=0;
	       int tempRes=0;
	       int k=0;
	       for(int i=0;i<n;i++){
	           //Find the longest substring
	           if(k==n)
	              break;
	           if(S2.contains(S1.substring(i,i+1))){
	               tempRes=1;
	               //Iteration over a S1 to find if there is sequence of charts
	               for( k=i+2;k<=n;k++){
	                   if(S2.contains(S1.substring(i,k)))
	                      tempRes++;
	                   else
	                       break;
	                   
	               }
	               result=Math.max(result,tempRes);
	           }
	           
	       }
	       return result;
	   }
	public static void main(String ar[]) {
		int n=2,m=3;
		String S1 = "ABC", S2 ="ACB";
		System.out.println(longestCommonSubstr(S1,S2,n,m));
	}
}
