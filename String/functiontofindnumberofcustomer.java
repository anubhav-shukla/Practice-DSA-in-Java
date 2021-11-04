package DSA;

public class functiontofindnumberofcustomer {
static int MAX_CHAR = 26;
 static int runCustomerSimulation(int n, char []seq) {
	 char []seen = new  char[MAX_CHAR];
	 int res = 0;
	 int occupied = 0;
	 for (int i=0; i<seq.length; i++) {
		 int ind = seq[i] - 'A';
		 if(seen[ind] == 0) {
			 seen[ind] = 1;
			 if(occupied < n) {
				 occupied ++;
				 seen[ind] = 2;
			 }
			 else
				res++;
			
			 }
			 else {
				 if(seen[ind] == 2)
					 occupied--;
				 seen[ind] = 0;
			 }
		 }
		 return res;
	 }
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toCharArray()));
	}

}
