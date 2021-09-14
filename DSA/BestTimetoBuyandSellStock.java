package DSA;

public class BestTimetoBuyandSellStock {
	 public int maxProfit(int[] prices) {
	        int lsf = Integer.MAX_VALUE;
	        int op = 0;
	        int pist = 0;
	        
	        for(int i = 0; i < prices.length; i++){
	            if(prices[i] < lsf){
	                lsf = prices[i];
	            }
	            pist = prices[i] - lsf;
	            if(pist > op){
	                op = pist;
	            }
	        }
	        System.out.println(op);
	        return op;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] price = {7,9,42,1,2,90};
		BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
		ob.maxProfit(price);
		

	}

}
