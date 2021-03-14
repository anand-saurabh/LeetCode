class Solution {
    Map<Integer, Set<Integer>>
        map = new HashMap();
    
    public boolean canCross(int[] stones) {
        Set<Integer>
            set = new HashSet();
        for (int i : stones)
        {
            set.add(i);
        }
        return frogJump(set, 1, 1, stones[stones.length - 1]);
    }
    
    boolean frogJump(Set<Integer> stones, int pos, int k, int target)
    {
        
        
        if(pos == target)
        {
            return true;
        }
        if(map.containsKey(pos))
        {
            Set<Integer>
                posn = map.get(pos);
            if(posn.contains(k))
            {
                return false;
            }
            else
            {
                posn.add(k);
                map.put(pos, posn);
            }
        }
        else
        {
            Set<Integer>
                posn = new HashSet();
            posn.add(k);
            map.put(pos, posn);
        }
        if(pos > target)
        {
            return false;
        }
        if(!stones.contains(pos))
        {
            return false;
        }
        
        return frogJump(stones, pos + k - 1, k-1, target) || frogJump(stones, pos + k + 1, k + 1, target)
            || frogJump(stones, pos + k , k, target);
    }
}