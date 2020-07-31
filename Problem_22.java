class Solution {
    List<String>
        ans = new ArrayList();
    
    public List<String> generateParenthesis(int n) {
        
        generate(1, 0 , new Stack<Character>(), n, '(', new StringBuffer());
        return ans;
    }
    
    void generate(int m, int n, Stack<Character>
                 stack, int max, Character ch, StringBuffer sb)
    {
        if(m > max || n > max)
        {
            return;
        }
        
        Stack<Character> temp = (Stack<Character>) stack.clone();
        StringBuffer temp1 = new StringBuffer(sb);
        switch (ch)
        {
            case '(' : stack.push(ch);
                temp.push(ch);
                sb.append(ch);
                temp1.append(ch);
                break;
            case ')' : if (!stack.isEmpty() && stack.peek() == '(')
            {
                sb.append(ch);
                stack.pop();
                temp1.append(ch);
                temp.pop();
            }
                else
                {
                    return;
                }
                break;
        }
        if(m == max && n == max)
        {
            if(stack.isEmpty())
            {
                ans.add(String.valueOf(sb));
            }
            return;
        }
       generate(m + 1, n, stack, max, '(', sb);
        generate(m, n + 1, temp, max, ')', temp1);
        
    }
    
    
}