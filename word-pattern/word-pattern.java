class Solution {
    public boolean wordPattern(String pattern, String str) {
     
        
        Map<Character, String>
            map = new HashMap();
        Set<String>
            set = new HashSet();
        
        String [] input = str.split(" ");
        if(pattern.length() != input.length)
        {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                String m = map.get(pattern.charAt(i));
                if(!m.equals(input[i]))
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(input[i]))
                {
                    return false;
                }
                set.add(input[i]);
                map.put(pattern.charAt(i), input[i]);
            }
            
            
        }
        return true;
    }
}