class Solution {
   
    public String longestPalindrome(String s) {
        int len = s.length();
        int max = 0;
        String ans = "";
        String tmp1 = "";
        String tmp2 = "";
        String tmpMax = "";
        for (int i = 0; i < len; i++)
        {
            tmp1 = longestPalindrome(s, i, i, len);
            tmp2 = longestPalindrome(s, i, i + 1, len);
            
            tmpMax = tmp1.length() > tmp2.length() ? tmp1 : tmp2;
            
            if(tmpMax.length() > max)
            {
                
                ans = tmpMax;
                max = tmpMax.length(); 

            }
            
        }
        return ans;
        
        }
    
    String longestPalindrome(String s, int beg, int next, int len)
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

        
        while(beg >= 0 && next < len && s.charAt(beg) == s.charAt(next))
        {
            if(beg != next)
            sb.append(s.charAt(beg));
            sb1.append(s.charAt(next));
            beg--;
            next++;
        }
        
        return sb.reverse().toString() + sb1.toString();
    }
    
}
