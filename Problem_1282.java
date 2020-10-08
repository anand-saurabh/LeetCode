class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>>
            map = new HashMap();
        List<List<Integer>>
            ans = new ArrayList();
        
        for (int i = 0; i < groupSizes.length; i++)
        {
            if(map.containsKey(groupSizes[i]))
            {
                List<Integer> temp = map.get(groupSizes[i]);
                if(temp.size() < groupSizes[i])
                {
                    temp.add(i);
                    if(temp.size() == groupSizes[i])
                    {
                        ans.add(temp);
                        map.put(groupSizes[i], new ArrayList());
                    }
                    else
                    {
                        map.put(groupSizes[i], temp);
                    }
                }
            }
            else
            {
                List<Integer>
                    tempList = new ArrayList();
                
                    tempList.add(i);
                    if(tempList.size() == groupSizes[i])
                    {
                        ans.add(tempList);
                        map.put(groupSizes[i], new ArrayList());
                    }
                else
                {
                        map.put(groupSizes[i], tempList);
                }
            }
        }
        return ans;
    }
}