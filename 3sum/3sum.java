class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4 -4 -3 -2 -1 0 2 
        
        Arrays.sort(nums);
        
        //1 2 2 3 4
List<List<Integer>>
    ans = new ArrayList();
        
        int start;
        int end;
        int key;
        int sum = 0;
        
        
        for (int i = 0; i < nums.length - 1; i++)
        {
            if(i != 0 && nums[i] == nums[i-1])
            {
                continue;
            }
   
            key = nums[i];
            
            start = i + 1;
            end = nums.length - 1;
            while(start < end)
            {
                sum = nums[i] + nums[start] + nums[end];
                if(sum > 0)
                {
                    end--;
                }
                else if (sum == 0)
                {
                             List<Integer>
                temp = new ArrayList();
                                temp.add(nums[i]);
​
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    start++;
                    end--;
                    while(start < end && start < nums.length - 1 && nums[start] == nums[start-1])
                    {
                        start++;
                    }
                    
                    while(start < end && end > 1 && nums[end] == nums[end+1])
                    {
                        end--;
                    }
                    ans.add(temp);
                    
                }
                else
                {
                    start++;
                    
                } 
            }  
        }
        
        return ans;
        
    }
}
