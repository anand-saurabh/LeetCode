// Problem: 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
     
        int curSum = 0;
        int len = nums.length;
        int sum = (len) * (len + 1)/2;
        for (int i = 0; i < len; i++)
        {
            curSum += nums[i];
        }
        int missing = sum - curSum;
        return missing;
    }
}