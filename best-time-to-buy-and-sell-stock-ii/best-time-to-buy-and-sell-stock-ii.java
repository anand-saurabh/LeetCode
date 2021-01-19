class Solution {
    public int maxProfit(int[] a) {
        
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int i = 0;
        for (i = 1; i < a.length; i++)
        {
           if(a[i] > a[i-1])
           {
               continue;
           }
            else
            {
                ans += a[i - 1] - a[start];
                start = i;
            }
​
        }
        if (a[i - 1] - a[start] > 0)
        {
            ans += a[i - 1] - a[start];
        }
        return ans;
    }
}
