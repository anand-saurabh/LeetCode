//890. Find and Replace Pattern
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        String key = "";
        List<String> ans = new ArrayList();
        for (int i = 0; i < words.length; i++)
        {
            key = words[i];
            Map<Character, Character>
                charMap = new HashMap();
            
             Set<Character>
                revSet = new HashSet();
            boolean isCorrect = true;
            StringBuffer sb = new StringBuffer();
            int len = key.length();
            for (int j = 0; j < len; j++)
            {
                if(key.length() != pattern.length())
                {
                    break;
                }
                if(charMap.containsKey(key.charAt(j)))
                {
                    Character c = charMap.get(key.charAt(j));
                    sb.append(c);
                }
                else
                {
                    if(revSet.contains(pattern.charAt(j)))
                    {
                        break;
                    }
                    charMap.put(key.charAt(j), pattern.charAt(j));
                    revSet.add(pattern.charAt(j));
                    sb.append(pattern.charAt(j));
                }        
            }
            if(sb.toString().equals(pattern))
            {
                ans.add(key);
            }
            
        }
        return ans;
        
    }
}