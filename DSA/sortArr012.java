package DSA;

public class sortArr012 {
	public static void sort1(int arr[],int n) {
		int zeroCount = 0;
		int oneCount = 0;
		for (int i = 0; i < arr.length; i++) {
		 
		              
		              if (arr[i] == 0)
		                  zeroCount++;
		 
		            
		              if (arr[i] == 1)
		                   oneCount++;
		        }
		 
		        
		        for (int i = 0; i < zeroCount; i++) {
		            arr[i] = 0;
		        }
		 
		       
		       for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
		            arr[i] = 1;
		       }
		 
		      
		      for (int i = (zeroCount + oneCount); i < arr.length; i++) {
		            arr[i] = 2;
		      }
		   }
		 
	public  static void main(String  arg[]) {
		int arr[]= {1,0,0,2,0,1};
		sort1(arr,6);
		for(int i =0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
	}


