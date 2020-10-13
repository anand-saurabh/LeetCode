class Solution {
    
    public int numTrees(int n) {
        int dp[] = new int[n + 1];
        dp [0] = 1;
        dp[1] = 1;
        return tot(n, dp);
    }
    
    int tot(int n, int [] dp)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        if(dp[n] != 0)
        {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            ans  += tot(i, dp) * tot(n - i - 1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }
    
}