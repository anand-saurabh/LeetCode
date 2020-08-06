class Solution {
    public boolean isNStraightHand(int[] nums, int W) {
        
        
        if(W == 1)
        {
            return true;
        }
        Arrays.sort(nums);
        
   
        Map<Integer, Integer>
            map = new LinkedHashMap();
    
        int leng = nums.length;
        
        for (int i = 0; i < leng; i++)
        {
            map.put(nums[i], 
                    map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Integer>
            keys = map.keySet();
        int count = keys.size();
        
        Iterator itr = keys.iterator();
        
        int len = 0;
        
        Map<Integer, Integer>
            copy = new HashMap(map);
        int prev = (int)itr.next();
        int key = prev;
        while(!copy.isEmpty())
        {
            if(copy.containsKey(prev))
            {
                key = prev;
            }
            else
            {
                key = (int)itr.next();
                prev = key;
            }
            
            if(copy.containsKey(key))
            {

                if(copy.get(key) == 1)
                {
                    copy.remove(key);
                }
                else
                {
                    copy.put(key, copy.get(key) - 1);
                }
            len = 1;
             while(true)
            {
                 
            if(copy.containsKey(key + 1))
            {
             

                len++;
                key = key + 1;
                if(copy.get(key) == 1)
                {
                    copy.remove(key);
                }
                else
                {
                    copy.put(key, copy.get(key) - 1);
                }
                if(len == W)
                {
                    break;
                }
            }
                 else if(len != W)
                {

                    return false;
                }
                else
                {
                    
                    break;
                }
            }
        }
        }
        return true;
    }
}