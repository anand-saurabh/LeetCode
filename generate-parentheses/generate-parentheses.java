class Solution {
    List<String>
        ans = new ArrayList();
    
    public List<String> generateParenthesis(int n) {
        generate(n, 0, 0, "");
        return ans;
    }
    
    void generate(int n, int open, int close, String temp)
    {
        if(open == close && open == n)
        {
            ans.add(temp);
            return;
        }
        
        if(open < n)
        {
            generate(n, open + 1, close, temp + '(');
        }
        if(close < open)
        {
            generate(n, open, close + 1, temp + ')');
        }
        
    }
}
