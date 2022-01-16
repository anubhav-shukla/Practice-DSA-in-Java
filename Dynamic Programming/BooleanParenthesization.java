package DSA;

public class BooleanParenthesization {
	 static int MOD=1003;
	    public static int countWays(int N, String S){
	        int store[][][]=new int [2][S.length()][S.length()];
	        for(int i=0;i<2;i++){
	            for(int j=0;j<S.length();j++){
	                for(int k=0;k<S.length();k++){
	                    store[i][j][k]=-1;
	                }
	            }
	        }
	        return(dp(0,S.length()-1,1,S,store));
	    }//countWays
	    public static int dp(int s,int e,int val,String str,int store[][][]){
	        if(s==e){
	            if((val==1 && str.charAt(s)=='T') || (val==0 && str.charAt(s)=='F'))
	                return(1);
	            return(0);
	        }
	        
	        if(store[val][s][e]!=-1)
	            return(store[val][s][e]);
	        
	        long ans=0;
	        for(int i=s+1;i<e;i++){
	            if(str.charAt(i)=='&' || str.charAt(i)=='|' ||str.charAt(i)=='^'){
	                int v1=dp(s,i-1,0,str,store);//F
	                int v2=dp(s,i-1,1,str,store);//T
	                int v3=dp(i+1,e,0,str,store);//F
	                int v4=dp(i+1,e,1,str,store);//T
	                if(str.charAt(i)=='&' && val==0){//FF FT TF
	                    ans=(ans+(v1*v3)%MOD)%MOD;
	                    ans=(ans+(v1*v4)%MOD)%MOD;
	                    ans=(ans+(v2*v3)%MOD)%MOD;
	                }
	                if(str.charAt(i)=='&' && val==1){//TT
	                    ans=(ans+(v2*v4)%MOD)%MOD;
	                }
	                if(str.charAt(i)=='|'&& val==0){//FF
	                    ans=(ans+(v1*v3)%MOD)%MOD;
	                }
	                if(str.charAt(i)=='|'&& val==1){//TT TF FT
	                    ans=(ans+(v2*v4)%MOD)%MOD;
	                    ans=(ans+(v2*v3)%MOD)%MOD;
	                    ans=(ans+(v1*v4)%MOD)%MOD;
	                }
	                if(str.charAt(i)=='^'&& val==0){//TT FF
	                    ans=(ans+(v2*v4)%MOD)%MOD;
	                    ans=(ans+(v1*v3)%MOD)%MOD;
	                }
	                if(str.charAt(i)=='^'&& val==1){// TF FT
	                    ans=(ans+(v2*v3)%MOD)%MOD;
	                    ans=(ans+(v1*v4)%MOD)%MOD;
	                }
	            }
	        }
	        store[val][s][e]=(int)ans;
	        return(store[val][s][e]);
	    }
	public static void main(String ar[]) {
	int	N = 7;
				String S = "T|T&F^T";
		System.out.println(countWays(N,S));
	}
}
