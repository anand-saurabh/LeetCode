//Problem: 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int i;
        int k = 0;
        int temp;
        int count = 0;
        int len = nums.length;
        k = len - 1;
    
        for (i = 0; i < len; i++)
        {
            if(nums[i] != val)
            {
                count++;
                
            }
        }
        for (i = 0; i < count; i++)
        {
            if(nums[i] == val)
            {
                while(k < len && nums[k] == val)
                {
                    k--;
                }
                if(k < len)
                {
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                }
            }
        }
        return count;
    }
}