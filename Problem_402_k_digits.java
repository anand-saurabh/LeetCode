class Solution {
    public String removeKdigits(String num, int k) {
        
        if(num.length() == 0)
        {
            return num;
        }
        Stack<Character>
            s = new Stack();
        s.push(num.charAt(0));
        
        for (int i = 1; i < num.length(); i++)
        {
            
            if(k > 0 && !s.isEmpty() && s.peek() > num.charAt(i))
            {
                
                while(!s.isEmpty() && k > 0 && s.peek() > num.charAt(i))
                {
                    k--;
                    s.pop();
                }
                s.push(num.charAt(i));
            }
            else
            {
                s.push(num.charAt(i));
            }
        }
        if(k > 0)
        {
            while(k > 0 && !s.isEmpty())
            {
                s.pop();
                k--;
            }
        }
        
        StringBuffer ans = new StringBuffer();
        while(!s.isEmpty())
        ans.append(s.pop());
    
        int i = ans.length() - 1;
        while(ans.length() > 0 && ans.charAt(i) == '0')
        {
            ans.setLength(ans.length() - 1);
            i--;
        }
        if(ans.length() != 0)
        return ans.reverse().toString();
        return "0";
        
    
    }
}