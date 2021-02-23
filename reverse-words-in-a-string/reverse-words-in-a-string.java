class Solution {
    public String reverseWords(String s) {
        
        String [] input = s.split("\\s+");
        String ans = new String();
        int len = input.length;
        
        for (int i = len - 1; i >= 0; i--)
        {
            ans += " " + input[i];
        }
        ans = ans.trim();
        return ans;
    }
}