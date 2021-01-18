class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
        {
            return false;
        }
        Map<Character, Integer>
            map = new HashMap();
        int len = s.length();
        int len1 = t.length();
        
        int freq = 0;
        for (int i = 0; i < len; i++)
        {
            freq = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), freq + 1);
        }
        
         for (int i = 0; i < len1; i++)
        {
            
             if(!map.containsKey(t.charAt(i)))
             {
                 return false;
             }
             else
             {
                 freq = map.get(t.charAt(i));
                 map.put(t.charAt(i), freq -1);
             }
        }
        Set<Character>
            set = map.keySet();
        for (char c : set)
        {
            if(map.get(c) != 0)
            {
                return false;
            }
        }
        return true;
    }
}
