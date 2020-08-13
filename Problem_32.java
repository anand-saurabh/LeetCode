class Solution {
    public int longestValidParentheses(String s) {
        // )()())
        Stack<Integer>
            stack = new Stack();
        char c;
        int len = s.length();
        int max = 0;
        int curLen;
        boolean prev = true;
        for (int i = 0; i < len; i++)
        {
            c = s.charAt(i);
            switch (c)
            {
                case '(' : stack.push(i);
                    break;
                case ')' : 
                
                        if(!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                        {          
                            stack.pop();
                        }
                        else
                        {
                            
                            stack.push(i);
                        }
                    break;
            }            
        }
        if(stack.isEmpty())
        {
            return s.length();
        }
        int index = stack.size() - 1;
        int[] a = new int[stack.size()];
        while(!stack.isEmpty())
        {
            a[index--] = stack.pop();
        }
        
        if(a.length == 1)
        {
            max = Math.max(a[0], s.length() - a[0] - 1);
            return max;
        }
        max = Math.max(a[0], s.length() -1  - a[a.length - 1]);
        for (int i = 0; i < a.length - 1; i++)
        {
            curLen = a[i+1] - a[i] - 1;
            if(curLen > max)
            {
                max = curLen;
            }
        }
        
        return max;
        
    }
}