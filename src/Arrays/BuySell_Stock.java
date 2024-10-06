package Arrays;

public class BuySell_Stock {
    public static int Sell_Stock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0;i<prices.length;i++){
            if (buyPrice<prices[i]){
                 // profit
                int profit = prices[i] - buyPrice;  // Today Price
                maxProfit = Math.max(maxProfit,profit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit of the Day -> "+Sell_Stock(prices));
    }
}
