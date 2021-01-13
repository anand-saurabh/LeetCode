class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        
        int cur = max;
        for (int i = 1; i < nums.length; i++)
        {
            
            if(nums[i] > cur + nums[i])
            {
                cur = nums[i];
                if(cur > max)
                {
                    max = cur;
                }
            }
            else 
            {
                cur += nums[i];
            }
            if(cur > max)
            {
                max = cur;
            }
        }
​
        return max;
    }
    
}
