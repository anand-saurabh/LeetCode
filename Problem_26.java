//26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int ans = 0;
        if(nums.length == 0){
            return ans;
        }
    
        int len = nums.length;
        int key = nums[0];
        ans += 1;
        int pos = 1;
        for (int i = 1; i < len; i++)
        {
            if(nums[i] != key)
            {
                key = nums[i];
                nums[pos++] = nums[i];
                ans++;
            }
            
        }
        return ans;
    }
}