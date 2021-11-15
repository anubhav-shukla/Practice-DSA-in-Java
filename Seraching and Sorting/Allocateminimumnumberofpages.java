package DSA;

public class Allocateminimumnumberofpages {
	 static boolean allocationPossible(int barrier,int n,int A[],int k){
	       int student=1,pages=0;
	       for(int i=0;i<n;i++){
	           if(A[i]>barrier)return false;
	           if(A[i]+pages>barrier){
	               student++;
	               pages=A[i];
	           }
	           else
	           pages+=A[i];
	       }
	       if(student>k)
	           return false;
	       return true;
	   }
	   public static int findPages(int[]A,int N,int M)
	   {
	       //Your code here
	       int high=0,low=0,res=0,mid=0;;
	       for(int i=0;i<A.length;i++)
	           high+=A[i];
	       while(low<=high){
	           mid=(low+high)/2;
	           if(allocationPossible(mid,N,A,M)){
	               high=mid-1;
	           }
	           else{
	               low=mid+1;
	           }
	       }
	       return low;
	       
	   }
	   public static void main(String ar[]) {
      		  int N = 4;
				   int A[] = {12,34,67,90};
				   int M = 2;

		   System.out.println(findPages(A,N,M));
	   }
}
