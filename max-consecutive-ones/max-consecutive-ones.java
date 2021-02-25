class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int count = 0;
        int  max = 0;
        for (int i = 0; i < len; i++)
        {
            if(nums[i] == 1)
            {
                count += 1;
                if(count > max)
                {
                    max = count;
                }
                
            }
            else
            {
                if(count > max)
                {
                    max = count;
                }
                count = 0;
            }
            
        }
        return max;
    }
}