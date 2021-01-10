class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        if(len == 0)
        {
            return 0;
        }
        int []greatest = new int[len];
        int max = prices[len-1];
        int maxProfit = 0;
     for (int i = len - 2; i >= 0; i--)
     {
          //1 2 1 2
         if(prices[i] < max)
         {
             greatest[i] = max;
         }
         else if (prices[i] >= max)
         {
             max = prices[i];
             greatest[i] = 0;
         }
     }
        for (int i = 0; i < len - 1; i++)
        {
            if((greatest[i] - prices[i]) > maxProfit)
                maxProfit = greatest[i] - prices[i];
        }
        return maxProfit;
    }
}
