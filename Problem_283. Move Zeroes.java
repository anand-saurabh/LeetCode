//283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int len = nums.length;
        int temp;
        while(j < len)
        {
           while(i < len  && nums[i] != 0)
           {
               i++;
           }
            while(j < len && nums[j] == 0)
            {
                ++j;
            }

            if(i < j && i < len && j < len)
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 1;
            }            
            j += 1;
        }
    }
}