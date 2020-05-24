//Problem:35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int len = nums.length;
        while(i < len && nums[i] < target)
        {
            i++;
        }
        return i;
    }
}