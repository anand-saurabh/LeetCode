//Problem: 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
        {
            return -1;
        }
        int ans = -1;
        int len = nums.length;
        int [] left = new int[len];
        
        left[0] = 0;
        
        int sum = nums[0];
        for (int i = 1; i < len; i++)
        {
            left[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = len - 1; i >= 0; i--)
        {
            if(sum == left[i])
            {
                ans = i;
            }
            sum += nums[i];
        }
        return ans;
    }
}