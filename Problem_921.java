class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character>
            s = new Stack();
        int count = 0;
        
        int len = S.length();
        int i = 0;
        char ch;
        while(i < len)
        {
            ch = S.charAt(i);
            
            switch(ch) {
            
                case '(' : s.push(ch);
                    break;
                case ')' :  if (!s.isEmpty() && s.peek() == '(')
                {
                    s.pop();
                }
                    else
                    {
                        s.push(ch);
                    }
                    break;
            }
            i++;
        }
        return s.size();
    }
}