class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length - 1;
        
        int max = Integer.MIN_VALUE;
        
        int cur;
        while (start < end)
        {
            cur = Math.min(height[start], height[end]);
            cur = cur * (end - start);
            if (max < cur)
            {
                max = cur;
            }
            if(height[start] > height[end])
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return max;
    }
}
