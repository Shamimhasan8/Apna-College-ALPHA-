public class buysellStocks {
    public static int BuySellStocks(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            // Update minPrice if the current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate profit if selling at the current price
            int profit = prices[i] - minPrice;
            // Update maxProfit if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BuySellStocks(prices)); // Output: 5 (Buy on day 2 and sell on day 5)
    }
}
