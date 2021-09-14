package DSA;

public class BestTimetoBuyandSellStock2 {
	 public int maxProfit(int prices[]) {
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length - 1; i++) {
	            for (int j = i + 1; j < prices.length; j++) {
	                int profit = prices[j] - prices[i];
	                if (profit > maxprofit)
	                    maxprofit = profit;
	            }
	        }
	        System.out.println(maxprofit);
	        return maxprofit;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,23,5,67,90};
        BestTimetoBuyandSellStock2 ob = new BestTimetoBuyandSellStock2();
		ob.maxProfit(arr);
	}

}
