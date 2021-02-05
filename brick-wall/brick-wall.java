class Solution {
    public int leastBricks(List<List<Integer>> wall) {
     
        Map<Integer, Integer>
            map = new HashMap();
        int size = wall.size();
        
        int cur = 0;
        for (int i = 0; i < size; i++)
        {
            List<Integer>
                list = wall.get(i);
            cur = 0;
            for (int j = 0; j < list.size() - 1; j++)
            {
                cur += list.get(j);
                map.put(cur, map.getOrDefault(cur, 0) + 1);
            }
        }
        Set<Integer>
            keys = map.keySet();
        int max = 0;
        for (Integer key : keys)
        {
            if(max < map.get(key))
            {
                max = map.get(key);
            }
        }
        return size - max;
    }
}