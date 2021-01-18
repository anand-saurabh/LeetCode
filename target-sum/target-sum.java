class Solution {
    int ans = 0;
    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length == 0)
            return ans;
        find(nums, 0, -1, S);
        return ans;
        
    }
    
    void find(int[] num, int sum, int i, int S)
    {
        if(sum == S && i == num.length - 1)
        {
            ans++;
        }
        
        if(i < num.length - 1)
        {
        find(num, sum - num[i+1], i+1, S);
        find(num, sum + num[i+1], i+1, S);
        }
    }
}
