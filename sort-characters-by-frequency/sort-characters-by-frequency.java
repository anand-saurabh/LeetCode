class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer>
            charMap = new HashMap();
        
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < s.length(); i++)
        {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
            if(charMap.get(s.charAt(i)) > max)
            {
                max = charMap.get(s.charAt(i));
            }
        }
        
        Map<Integer, List<Character>>
            freqMap = new HashMap();
        
        Set<Character>
            keys = charMap.keySet();
        
        for (char key : keys)
        {
            if(freqMap.containsKey(charMap.get(key)))
            {
                freqMap.get(charMap.get(key)).add(key);
            }
            else
            {
                List<Character>
                    tem = new ArrayList();
                tem.add(key);
                freqMap.put(charMap.get(key), tem);
            }
            
        }
        
        StringBuffer ans = new StringBuffer();
        char tem;
        int m;
        for (int i = max; i >= 1; i--)
        {
            if(freqMap.containsKey(i))
            {
                List<Character>
                    charList = freqMap.get(i);
                
          
                for (int j = 0; j < charList.size(); j++)
                {
                    tem = charList.get(j);
                    m = 0;
                    while(m != i)
                    {
                        ans.append(tem);
                        m++;
                    }
