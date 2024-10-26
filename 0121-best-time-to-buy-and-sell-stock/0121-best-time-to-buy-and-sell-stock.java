class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrices = Integer.MAX_VALUE;
        int maxPro = 0;
        
        for(int i=0; i<n; i++){
            minPrices = Math.min(minPrices, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrices);
        }
        return maxPro;
    }
}