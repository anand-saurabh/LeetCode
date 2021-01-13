class Solution {
    public int maxProfit(int[] prices) { 
        
        if(prices.length == 1)
        {
            return 0;
        }
        
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            if((prices[i] - min) > max)
            {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
