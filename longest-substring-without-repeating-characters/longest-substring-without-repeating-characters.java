class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character>
            charSet = new HashSet();
        
        int max = Integer.MIN_VALUE;
        int curLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(charSet.contains(s.charAt(i)))
            {
                if(max < curLen)
                {
                    max = curLen;
                }
                while(s.charAt(start) != s.charAt(i))
                {
                    charSet.remove(s.charAt(start));
                    start++;
                }
                start++;
                curLen = i - start + 1;
            }
            else
            {
                curLen++;
            }
            charSet.add(s.charAt(i));
        }
        
        if(curLen > max)
        {
            max = curLen;
        }
        return max;
        
    }
}
