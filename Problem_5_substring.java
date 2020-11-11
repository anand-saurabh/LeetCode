class Solution {
   
    int max = 0;
    int len = 0;
    String ans;
    public String longestPalindrome(String s) {
        
        if(s.length() == 1)
        {
            return s;
        }
        for (int i = 0; i < s.length(); i++)
        {
            isPalindrome(i,i, s.length(), s, 0, new StringBuilder());
            isPalindrome(i,i+1, s.length(), s, 0, new StringBuilder());
        }
        return ans;
    }
    
    void isPalindrome(int i, int j, int len, String s, int cur, StringBuilder sb)
    {
        if(i < 0 || j >= s.length())
        {
            return;
        }
        
        if(s.charAt(i) == s.charAt(j))
        {
            if(i != j)
            {
                cur +=2;
                sb.append(s.charAt(i));
                sb.insert(0, s.charAt(j));
            }
            else
            {
                cur += 1;
                sb.append(s.charAt(i));
            }
            if(cur > max)
            {
                max = cur;
                ans = sb.toString();
            }
            isPalindrome(--i, ++j, len, s, cur, sb);  
        }
    }
}
