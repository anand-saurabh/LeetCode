class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap();
        Character c;
        for (int i = 0; i < s.length(); i++)
        {
            c =  s.charAt(i);
            if(map.containsKey(c))
            {
                int temp = map.get(c);
                map.put(c, temp+1);
            }
            else
            {
                map.put(c, 1);
            }
        }
        
        if(map.size() > 0){
​
            Set<Character> keys = map.keySet();
            for (Character k : keys)
            {
                if(map.get(k) == 1)
                {
                    return s.indexOf(k);
                }  
            }
        }
        return -1;
    }
}
