//457. Circular Array Loop

class Solution {
    public boolean circularArrayLoop(int[] nums) {
        
        int len = nums.length;
        int visited;
        boolean isPositive = false;
        Set<Integer>
            hashSet = new HashSet();
        int count = 0;
        int j = 0;
        for (int i = 0; i < len; i++)
        {
            visited = i;
            if(nums[i] > 0)
            {
                isPositive = true;
            }
            else
            {
                isPositive = false;
            }
            count = 0;
            j = i; 
            hashSet = new HashSet();
            while(count <= len)
            {
                if((isPositive && nums[j] < 0) || (!isPositive && nums[j] > 0))
                {
                    break;
                }
                if(isPositive)
                j = (j + nums[j]) % len;  
                else
                {
                    if((nums[j] + j) < 0)
                        j = (len + ((j + nums[j]) % len))%len;
                    else
                    {
                        j = nums[j] + j;
                    }
                }
                hashSet.add(j);
                if(j == visited && hashSet.size() > 1)
                {
                    System.out.print("" + j);
                    return true;
                }
                ++count;
            }

        }
        return false;
    }
}