package DSA;

public class LongestPalindromeinaString {
static String logestPalin(String S) {
	int n=S.length();
    if(n==1) return S;
    String res="";
    String res1="";
     String sb;
    for(int i=1;i<n;i++){
        int p=i-1,f=i+1;
        sb=String.valueOf(S.charAt(i));
        while(p>=0 && f<n){
            if(S.charAt(p)==S.charAt(f)){
                sb=String.valueOf(S.charAt(p))+sb+String.valueOf(S.charAt(f));
              //  System.out.println(sb);
                p--;
                f++;
            }
            else break;
        }
        if(sb.length()>res.length()){
            res=sb;
        }}
    
     for(int i=1;i<n;i++){
         if(S.charAt(i-1)!=S.charAt(i)) continue;
        int p=i-1,f=i;
        sb="";
        while(p>=0 && f<n){
            if(S.charAt(p)==S.charAt(f)){
                sb=String.valueOf(S.charAt(p))+sb+String.valueOf(S.charAt(f));
               // System.out.println(sb);
                p--;
                f++;
            }
            else break;
        }
        if(sb.length()>res1.length()){
            res1=sb;
        }}
        
    return (res1.length()>res.length())?res1:(res.length()==1)?S.substring(0,1):res;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geek";
        System.out.println(logestPalin(str));
	}

}
