class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        
        int cur = 0;
        
        int len = nums.length;
        int start = 0;
        int i = 0;
        while(i < len)
        {
            cur += nums[i];
            if(cur >= s)
            {
                while(cur - nums[start] >= s)
                {
                    cur -= nums[start];
                    start++;
                }
               if(min > (i - start + 1)) 
               {
                   
                   min = i + 1 - start;
               }
            }
            i++;
        }
        if(min == Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;
    }
}