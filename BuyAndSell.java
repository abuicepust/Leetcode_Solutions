public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int i=0;i<prices.length;i++){
            if (prices[i] < buy) {
                buy = prices[i];
            }else if (prices[i] - buy > sell) {
                sell = prices[i] - buy;
            }
        }
        return sell;
    }
    
}
