//Problem: 599. Minimum Index Sum of Two Lists
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer>
            map = new HashMap();
    
        List<String>
            ansList = new ArrayList();
  
        int curMin = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++)
        {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++)
        {
            if(map.containsKey(list2[i]))
            {
                int ind = map.get(list2[i]);
                ind = i + ind;
                if(ind < curMin)
                {
                    ansList = new ArrayList();
                    ansList.add(list2[i]);
                    curMin = ind;
                }
                else if(ind == curMin)
                {
                    ansList.add(list2[i]); 
                }
            }
        }
        return ansList.toArray(new String[ansList.size()]);
    }
}