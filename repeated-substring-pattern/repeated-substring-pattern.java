class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String temp = s + s;
        if(temp.substring(1, temp.length() - 1).contains(s))
        {
            return true;
        }
      
        return false;
    
    }
}