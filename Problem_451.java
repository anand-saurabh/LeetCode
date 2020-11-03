class Solution {
    public String frequencySort(String s) {
        int [] freq = new int[26];
        Map<Character, Integer>
            map = new HashMap();
        int max = 1;
        for (int i = 0; i < s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                if(max < map.get(s.charAt(i)))
                {
                    max = map.get(s.charAt(i));
                }
            }
            else
            {
                map.put(s.charAt(i), 1);
            }
        }
        List<Character> [] temp = new ArrayList[max + 1];
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = new ArrayList();
        }
        
        Set<Character>
            keys = map.keySet();
        for (char key : keys)
        {
            temp[map.get(key)].add(key);
        }
        
        StringBuffer sb = new StringBuffer();
        for (int i = max; i > 0; i--)
        {
            List<Character>
                tempList = temp[i];
            for (int k = 0; k < tempList.size(); k++)
            {
                char key = tempList.get(k);
            for (int j = 0; j < i; j++)
            {
                sb.append(key);
            }

            }   
        }
        
        return sb.toString();
    }
}