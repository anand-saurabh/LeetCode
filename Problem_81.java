class Solution {
    public boolean search(int[] nums, int target) {
        
        if(nums.length == 0)
        {
            return false;
        }
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(nums[mid] == target)
            {
                return true;
            }
            while(low <= high && nums[low] == nums[mid])
            {
                low++;
            }
            while(low <= high && nums[mid] == nums[high])
            {
                high--;
            }
            if(low > high)
            {
                break;
            }
            if(nums[low] == target || nums[high] == target)
            {
                return true;
            }
            
            if(nums[low] <= nums[mid])
            {
                if(target < nums[mid] && target >= nums[low])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
                
            }
            else
            {
                
                if(target > nums[mid] && target <= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
            return false;
        }
}