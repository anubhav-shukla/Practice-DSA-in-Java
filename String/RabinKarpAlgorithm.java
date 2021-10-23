package DSA;


public class RabinKarpAlgorithm {
    public final static int d=256;
    
    static void search(String pat, String txt, int q) {
    	int M=pat.length();
    	int N=txt.length(); 
    	int i,j;
    	int p=0;
    	int t=0;
    	int h=1;
    	
    	for(i=0; i<M-1;i++)
    		h=(h*d)%q;
    	for(i=0;i<M-1;i++) {
    		p=(d*p + pat.charAt(i))%q;
    		t=(d*t + txt.charAt(i))%q; 
    	}                              
    	for(i=0;i<=N-M;i++) {
    		if(p==t) {
    			for(j=0;j<M;j++) {
    				if(txt.charAt(i+j) != pat.charAt(j))
    					break;
    			}
    			if(j==M)
    				System.out.println("pattern found at index"+i);
    		}
    		if(i<N-M) {
    		    	t= (d*(t-txt.charAt(i)*h)+ txt.charAt(i+M))%q;
    		    	if(t<0)
    		    	t=(t+1);
    		    	  		    	
    		}
    		
    	}
    	System.out.println("Pattern is not found");
    	  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String txt = "gfg";
	        String pat = "g";
	            
	          // A prime number
	        int q = 101; 
	        
	          // Function Call
	        search(pat, txt, q);
	}

}
