package DSA;

public class profitbybuyingandsellingashare {
     static int maxProfit(int price[], int n) {
    	 int profit[] = new int[n];
    	 for(int i =0;i<n;i++) {
    		 profit[i] = 0;
    	 int max_price = price[n-1];
    	 for(int i1 = n-2;i1>=0;i1--) {
    		 if(price[i1]>max_price)
    			 max_price = price[i1];
    		 profit[i1] = Math.max(profit[i1+1], max_price-price[i1]);
    	 }
    	 int min_price = price[0];
    	 for(int i1 =1;i1<n;i1++) {
    		 if(price[i1]<min_price)
    			 min_price = price[i1];
    		 profit[i1] = Math.max(profit[i1-1], profit[i1]+(price[i1]-min_price));
    	 }
    	 int result = profit[n-1];
    	 return result;
    	 }
		return n;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {2,30,15,10,8,25,80};
		int n = price.length;
		System.out.println("Maximum Profit= "+maxProfit(price,n));

	}

}
