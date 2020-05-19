//Problem: 189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        // 1 2 3 4
        // 3 4 1 2
        int temp;
        int j = 0;
        
        int prev;
        temp = nums[j];
        
        while(k != 0)
        {
            j = 0;
            temp = nums[j];
            while(j < len)
            {
            prev = nums[(j+1) % len];
            nums[(j+1) % len] = temp;
            temp = prev;
            j++;
            }
            k--; 
        }
    }
    
}