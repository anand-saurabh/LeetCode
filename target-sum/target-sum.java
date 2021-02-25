class Solution {
    int mem[][];
    public int findTargetSumWays(int[] nums, int S) {
        mem = new int[nums.length][2001];
        
        for (int [] tem : mem)
        {
            Arrays.fill(tem, -1);
        }
        return findWays(nums, S, 0, 0);        
    }
    
    int findWays(int [] nums, int s, int index, int cur)
    {
        if(index >= nums.length)
        {
            if(cur == s)
            {
                return 1;
            }
            return 0;
        }
        if(mem[index][cur + 1000] != -1)
        {
            return mem[index][cur + 1000];
        }
        
        int a = findWays(nums, s, index + 1, cur + nums[index]);
        int b = findWays(nums, s, index + 1, cur - nums[index]);
        
        mem[index][cur + 1000] = a + b;
        return mem[index][cur + 1000];
    }
}