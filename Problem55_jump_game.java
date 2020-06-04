//55. Jump Game

class Solution {
    boolean ans = false;
    public boolean canJump(int[] nums) {
        Boolean [] mem = new Boolean[nums.length - 1];

        return maxJum(nums, 0, nums.length -1, 0, mem);
    }
    boolean maxJum(int nums[], int i, int len, int j, Boolean [] mem)
    {
        
        
        if(i == len)
        {
            return true;
        }
        if(i > len)
        {
            return false;
        }
         if(j > len)
        {
            return false;
        }
        if(mem[j] != null)
        {
            return mem[j];
        }
        boolean ans  = false;
        for (int k = 1; k <= nums[j]; k++)
        {
            ans = ans || maxJum(nums, i + k, len, j + k, mem);
            if(ans == true)
            {
                break;
            }
        }
        mem[j] = ans;
        return mem[j];
    }
}