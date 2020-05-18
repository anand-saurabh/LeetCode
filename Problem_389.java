// problem : 389. Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer>
            charsPresentMap = new HashMap();
        char key = '0';
        int freq = 0;
        for (int i = 0; i < s.length(); i++)
        {
            key = s.charAt(i);
            freq = charsPresentMap.getOrDefault(key, 0);
            charsPresentMap.put(key, freq + 1);
        }
        for (int i = 0; i < t.length(); i++)
        {
            key = t.charAt(i);
            if(charsPresentMap.containsKey(key))
            {
                freq = charsPresentMap.get(key);
                charsPresentMap.put(key, freq - 1);
            }
            else
            {
                return key;
            }
        }
        Set<Character>
            set = charsPresentMap.keySet();
        for (char c : set)
        {
            if(charsPresentMap.get(c) != 0)
                return c;
        }
        return key;
    }
}

/* Better solution: find the Ascii sum of string b and subtract ascii sum of string a. This is the ascii value of extra character.