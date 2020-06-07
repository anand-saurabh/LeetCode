//Problem: 394. Decode String
class Solution {
    public String decodeString(String s) {
        
        Stack<String>
            stack = new Stack();
        int count = 0;
        StringBuffer ans = new StringBuffer();
        StringBuffer num = new StringBuffer();
        StringBuilder temp = new StringBuilder();
        char ch;
        String charSeq;
        StringBuffer tem = new StringBuffer();
        for (int i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch) || ch == '[')
            {
                if(Character.isDigit(ch))
                {
                    num.append(ch);
                }
                else
                {
                    if(num.length() > 0)
                    {
                    stack.push(num.toString());
                    num = new StringBuffer();
                    }
                    stack.push(Character.toString(ch));
                }
            }
            else
            {
                temp = new StringBuilder();
                while(!stack.isEmpty() && !stack.peek().equals("["))
                {
                    charSeq = stack.pop();
                    temp.insert(0, charSeq);
                }
                stack.pop();
                
                count = Integer.parseInt(stack.pop());
                tem = new StringBuffer();
                while(count != 0)
                {
                    tem.append(temp);
                    count--;
                }
                stack.push(tem.toString());
            }
        }
        temp = new StringBuilder();
        while(!stack.isEmpty())
        {
            temp.insert(0,stack.pop());
        }
        return temp.toString();
        
    }
}