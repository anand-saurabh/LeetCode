class Solution {
    public int findPairs(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int len = nums.length;
        int high;
        
        for (int i = 0; i < len - 1; i++)
        {
            if(i == 0 || nums[i-1] != nums[i])
            {
                high = len -1;
                
                while(high > i && (nums[high] - nums[i]) > k)
                {
                    high--;  
                }
                    
                if(high > i && nums[high] - nums[i] == k)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}