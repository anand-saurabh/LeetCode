class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>
            ans = new ArrayList();
        
        int len = nums.length;
        if(len == 0)
        {
            return ans;
        }
        String temp = "";
        int i = 0;
        int prev = nums[i];
        int start = i;
        i++;
            
        while(i < len)
        {
           if(nums[i] - prev == 1)
           {
               prev = nums[i];
           }
            else
            {
                temp = start != i-1 ? String.valueOf(nums[start]) + "->" + String.valueOf(prev) :
                String.valueOf(nums[start]);
                ans.add(temp);
                start = i;
                prev = nums[i];
            }
            i++;
        }
        if(start != len)
        {
            temp = start != i-1 ? String.valueOf(nums[start]) + "->" + String.valueOf(prev) : 
            String.valueOf(nums[start]);
            ans.add(temp);
        }
        return ans;
    }
}