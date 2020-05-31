//Problem: 392. Is Subsequence

class Solution {
    Boolean [][] mem;
    public boolean isSubsequence(String s, String t) {
        mem = new Boolean[s.length() + 1][t.length() + 1];
        if(s == null || t == null)
        {
            return false;
        }
        return isSub(s, t, 0, 0, 0, s.length());
    }
    
    
    boolean isSub(String s, String t, int i, int j, int count, int len)
    {
        if(count == len)
        {
            mem[i][j] = true;
            return true;
        }
        if(mem[i][j] != null)
            return mem[i][j];
        if(i >= s.length() || j >= t.length())
        {
            mem[i][j] = false;
            return false;
        }
        
        if(s.charAt(i) == t.charAt(j))
        {
            
            return isSub(s, t, i + 1, j + 1, count + 1, len);
        }
        else
        {
            mem[i][j] = isSub(s, t, i, j + 1, count, len);
            return mem[i][j];
        }
    }
}