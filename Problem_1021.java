//1021. Remove Outermost Parentheses
class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character>
            s = new Stack();
        StringBuilder sb = new StringBuilder();
        
        int len = S.length();
        char temp;
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            temp = S.charAt(i);
            if(temp == '(')
            {
                
                if(!s.isEmpty())
                {
                    sb.append(temp);
                }
                s.push(temp);
            }                
            else
            {
                
                if(!s.isEmpty())
                {
                    s.pop();
                }
                if(!s.isEmpty())
                {//"(()(()))"

                    sb.append(")");
                }
            }
                
        }
        return sb.toString();
        
    }
}