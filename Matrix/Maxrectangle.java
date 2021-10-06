package DSA;

import java.util.Stack;

public class Maxrectangle {
	 public static int maxArea(int M[][], int n, int m) {
	        // add code here.
	        int [] currow = M[0];
	        int maxans = histogram(currow);
	        for(int i=1;i<M.length;i++){
	            for(int j=0;j<M[0].length;j++ ){
	                if(M[i][j] == 1){
	                    currow[j] += 1;
	                    
	                }else{
	                    currow[j] =0;
	                }
	            }
	            int currAns = histogram(currow);
	            maxans = Math.max(currAns,maxans);
	        }
	        return maxans;
	    }
	    
	    public static int histogram(int a[]){
	        int maxAns =0;
	        int[] ps = prevsmaller(a);
	        int[] ns = nextsmaller(a);
	        for(int i =0; i<a.length; i++){
	            int cur = (ns[i]-ps[i]-1)*a[i];
	            maxAns = Math.max(maxAns,cur);
	        }
	        return maxAns;
	    }
	    public  static int[] prevsmaller(int a[]){
	        int[] ps = new int[a.length];
	        Stack<Integer> s = new Stack<>();
	        for(int i=0; i<a.length; i++){
	            while(!s.isEmpty() && a[s.peek()] >= a[i]){
	                s.pop();
	            }
	            if(s.isEmpty()){
	                ps[i] = -1;
	            }else{
	                ps[i] = s.peek();
	            }
	            s.push(i);
	        }
	        return ps;
	    }
	    public static int[] nextsmaller(int a[]){
	        int[] ns = new int[a.length];
	        Stack<Integer> s = new Stack<>();
	        for(int i=a.length-1; i>=0; i--){
	            while(!s.isEmpty() && a[s.peek()] >= a[i]){
	                s.pop();
	            }
	            if(s.isEmpty()){
	                ns[i] = a.length;
	            }else{
	                ns[i] = s.peek();
	            }
	            s.push(i);
	        }
	        return ns;
	    }
	    public static void main(String args[]) {
	    	int n = 4, m = 4;
	    		int	M[][] = {{0 ,1, 1, 0},
	    			         {1, 1 ,1 ,1},
	    			         {1 ,1, 1, 1},
	    			         {1 ,1, 0 ,0}};
	    		System.out.println(maxArea(M,n,m));
	    		
	    		
	    }

	}


