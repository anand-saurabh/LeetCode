class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // -4 -1 1 2
        Arrays.sort(nums);
        int len = nums.length;
        int start;
        int end;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < len - 2; i++)
        {
            if(i == 0 || nums[i-1] != nums[i])
            {
            start = i + 1;
            end = len - 1;
            while(start < end)
            {
                sum = nums[i] + nums[start] + nums[end];
                if(sum == target)
                {
                    while(start < end && nums[end] == nums[end-1])
                    {
                        end--;
                    }
                    end--;
                    while(start < end && nums[start] == nums[start + 1])
                    {
                        start++;
                    }
                    start++;
                    min = 0;
                    ans = target;
                }
                else if (sum > target)
                {
                    if(Math.abs(sum - target) < min)
                    {
                        min = Math.abs(sum - target);
                        ans = sum;
                    }
                    --end;
                }
                else
                {
