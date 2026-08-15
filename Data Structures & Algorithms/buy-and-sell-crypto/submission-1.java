class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length < 2) {
            return maxProfit;
        }
        int left = 0;
        int right = left + 1;

        while(right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, (prices[right] - prices[left]));
            }
            else
                left = right;
            right++;
        }
        return maxProfit;
    }
}
