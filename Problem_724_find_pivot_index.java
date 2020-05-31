//Problem: 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
        {
            return -1;
        }
        int len = nums.length;
        int [] left = new int[len];
        int [] right = new int [len];
        
        left[0] = 0;
        right[len -1] = 0;
        
        int sum = nums[0];
        for (int i = 1; i < len; i++)
        {
            left[i] = sum;
            sum += nums[i];
        }
        sum = nums[len-1];
        for (int i = len - 2; i >= 0; i--)
        {
            right[i] = sum;
            sum += nums[i];
        }
        for (int i = 0; i < len; i++)
        {
            if(left[i] == right[i])
            {
                return i;
            }        
        }
        return -1;
    }
}