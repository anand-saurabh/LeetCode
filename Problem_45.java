class Solution {
    public int jump(int[] nums) {
        int[] mem = new int[nums.length];
        
        return findMin(0, nums.length, nums, mem);
    }
    
    
    private int findMin(int index, int len, int [] nums, int [] mem)
    {
        if(index >= len)
        {
            return Integer.MAX_VALUE - 1;
        }
        
        int min = Integer.MAX_VALUE - 1;
        
        if(mem[index] != 0)
        {
            return mem[index];
        }
        if(index == len - 1)
        {
            return 0;
        }
        for (int i = 1; i <= nums[index]; i++)
        {
           if(index + i < len - 1 && index + nums[index] > index + i + nums[index + i])
           {
               continue;
           }
           min = Math.min(min, 1 + findMin(index + i, len, nums, mem));
        }
        //System.out.println("val" + min);
        mem[index] = min;
        return min;
    }
}