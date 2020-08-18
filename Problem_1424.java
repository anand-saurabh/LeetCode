class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>>
            map = new LinkedHashMap();
        
        int count = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            List<Integer>
                temp = nums.get(i);
            for (int j = 0; j < temp.size(); j++)
            {
                count++;
                
                List<Integer> toPut = map.getOrDefault(i + j, 
                                                  new ArrayList());
                toPut.add(temp.get(j));
                map.put(i + j, toPut);
            }
        }
        Set<Integer>
            keys = map.keySet();
        
        int [] ans = new int[count];
        int index = 0;
        for (Integer key : keys)
        {
            List<Integer>
                temp = map.get(key);
            for (int i = temp.size() - 1; i >= 0; i--)
            {
                ans[index++] = temp.get(i);
            }
        }
        return ans;
    }
}