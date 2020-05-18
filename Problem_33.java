//problem:
//https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        
        int  mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high)
        {
            mid = (low + high)/2;
            if(nums[mid] == target)
                return mid;
            else
            {
                if(nums[mid] > nums[high] && nums[high] >= target)
                    low = mid + 1;
                else if (nums[mid] < nums[low] && target >= nums[low])
                    high = mid - 1;
                else
                {
                    if(target > nums[mid])
                        low = mid + 1;
                        else
                        high = mid - 1;
                }
            }
        }
        return -1;
        
        
    }
}

