//Problem: 153. Find Minimum in Rotated Sorted Array


class Solution {
    public int findMin(int[] nums) {
        
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int mid = 0;
        int min = Integer.MAX_VALUE;
        while(low < high)
        {
            mid = (low + high)/2;
            if(nums[mid] < min)
            {
                min = nums[mid];
            }
            if(nums[mid] > nums[high])
            {
                low = mid + 1;
                
            }
            else
            {
                high = mid - 1;
            }
        }
        if(nums[low] < min)
        {
            return nums[low];
        }
        return min;
    }
}