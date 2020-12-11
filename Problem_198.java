class Solution {
    public int rob(int[] nums) {
        int sum = 0;
        int [] memoi = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)
            memoi[i] = -1;
        int answer = findMaxRob(nums, 0, memoi);
        
        return answer;
    }
    
    public int findMaxRob(int [] nums, int i, int[] memoi)
    {
        if(i >= nums.length)
        {
            return 0;
        }
        if(memoi[i] >= 0)
        {
           return memoi[i];
        }
        
        int sum1 = nums[i] + findMaxRob(nums, i+2, memoi);
        int sum2 = findMaxRob(nums, i+1,memoi);
        
        int max = sum1 > sum2 ?  sum1:sum2;
        memoi[i] = max;
        return max;
        
    }
}