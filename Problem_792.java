class Solution {
    
    public int numMatchingSubseq(String S, String[] words) {
        
        
        int count = 0;
        int len = words.length;
        
        Set<String>
            ans = new HashSet();
        Set<Character>
            set = new HashSet();
        char s[] = S.toCharArray();
        char t[];
        for(int k = 0; k < S.length();k++)
        {
            set.add(S.charAt(k));
        }
        
             Set<Character>
            temp = new HashSet();
        for (int i = 0; i < len; i++)
        {
            temp = new HashSet();
            if(ans.contains(words[i]))
            {
                count++;
                continue;
            }
            t = words[i].toCharArray();

            for (int k = 0; k < t.length; k++)
            {
                temp.add(t[k]);
            }
            if(set.containsAll(temp))
            {
                if(findSub(s, t, 0, 0, s.length, t.length))
                {
                    ans.add(words[i]);
                    count++;
                }
            }
        }
        return count;
    }
    
    boolean findSub(char[] S, char[] t, int i, int j, int len1, int len2)
    {
        if(j >= len2)
        {
            return true;
        }
        if(i >= len1)
        {
            return false;
        }
        
        
    if(S[i] == t[j])
    {
        return findSub(S, t, i+1, j+1, len1, len2);
    }
    else
    {
        return findSub(S, t, i+1, j, len1, len2);
    }
        
    }
}