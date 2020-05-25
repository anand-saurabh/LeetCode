//482. License Key Formatting

// string matching

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        int j = S.length() - 1;
        
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        
        int count = 0;
        for (; j >= 0 ; j--)
        {
            
            if(S.charAt(j) == '-')
                continue;
            sb.insert(0,Character.toUpperCase(S.charAt(j)));
            count++;
            if(count == K)
            {
                ans.insert(0, "-" + sb);
                sb = new StringBuilder();
                count = 0;
            }
        }
        if(count != 0)
        {
            ans.insert(0, sb);
        }
        else
        {
            if(ans.length() > 0)
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
}