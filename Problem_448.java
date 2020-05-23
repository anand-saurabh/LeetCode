//Problem: 448. Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int key = 0;
        List<Integer>
            res = new ArrayList();
        int len = nums.length;
         for (int i = 0; i < len; i++)
         {
             key = Math.abs(nums[i]) - 1;
             
             if(!(nums[key] < 0))
             {
                 nums[key] = nums[key] * -1;
             }
         }
        for (int i = 0; i < len; i++)
        {
            
            if(nums[i] > 0)
            {
                res.add(i+1);
            }
            
        }
        return res;
    }
}