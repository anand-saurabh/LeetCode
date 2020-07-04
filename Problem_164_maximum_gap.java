//Problem: 164. Maximum Gap
class Solution {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if(len <= 1)
        {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
    
        for (int i = 1; i < len; i++)
        {
            if(nums[i] - nums[i-1] > max)
            {
                max = nums[i] - nums[i-1];
            }
        }
        return max;
        
    }
}