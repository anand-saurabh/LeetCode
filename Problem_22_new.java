class Solution {
    List<String>
        ans = new ArrayList();
    
    public List<String> generateParenthesis(int n) {
       generate(n, new String(), 0, 0);
        return ans;
        
    }
    
    void generate(int n, String cur, int open, int close)
    {
        if(close > open)
        {
            return;
        }
        if(open == close && (open + close) == 2*n)
        {
            ans.add(cur);
            return;
        }
        
         if(open < n)
        {
                generate(n, cur + '(', open + 1, close);
        } 
        if(open > close)
        {
            generate(n, cur + ')', open, close + 1);
        }
       
    }
}