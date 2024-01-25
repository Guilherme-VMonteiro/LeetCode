package Easy_121_Best_Time_to_Buy_and_Sell_Stock.Java;

public class Solution {
    public static void main(String[] args) {
        // int[] input = { 7, 1, 5, 3, 6, 4 };
        // int[] input = { 2, 1, 2, 1, 0, 1, 2 };
        // int[] input = { 7, 6, 4, 3, 1 };
        // int[] input = { 2, 4, 1 };
        // int[] input = { 1, 2 };
        // int[] input = { 3,2,6,5,0,3 };
        int[] input = { 1,2,4,2,5,7,2,4,9,0,9 };
        System.out.println(maxProfit(input));
    }

    public static int maxProfit(int[] prices) {

        if (prices.length == 1) return 0;

        int profit = 0;

        int pointer = 0;
        for (int idx = 1; idx < prices.length; idx++) {
            if (prices[pointer] < prices[idx]) {
                profit = Math.max(prices[idx] - prices[pointer], profit);
            } else {
                pointer = idx;
            }
        }

        return profit;
    }
}
