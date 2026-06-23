
public class BuyAndSellStocks {

    public static int maxStockProfit(int prices[]) {

            int n = prices.length;

            int maxProfit = 0;
            int buyingPrice = prices[0];



            for(int i=1; i<n; i++) {
                if(prices[i]>buyingPrice) {
                    int currentProfit = prices[i] - buyingPrice;
                    maxProfit = Math.max(maxProfit, currentProfit);
                }
                else {
                    buyingPrice = prices[i];
                }
            }

            return maxProfit;

        }

    public static void main(String args[]) {


        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Max profit will be: " + (maxStockProfit(prices)));

    }
}