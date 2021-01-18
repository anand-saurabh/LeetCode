class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int [] left = new int[len];
        int right [] = new int[len];
        
        left[0] = 1;
        int leftProd = nums[0];
​
        for (int i = 1; i < len; i++)
        {
            left[i] = leftProd;
            leftProd *= nums[i];
        }
        
        right[len-1] = 1;
        int rightProd = nums[len-1];
        
          for (int i = len - 2; i >= 0; i--)
        {
            right[i] = rightProd;
            rightProd *= nums[i];    
        }
        
        int [] ans = new int[len];
        
        for (int i = 0; i < len; i++)
        {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
