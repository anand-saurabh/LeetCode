class Solution {
    List<String>
        ans = new ArrayList();
    public List<String> letterCasePermutation(String S) {

                LinkedList<Character> val = new LinkedList();

        
        permute(S.toCharArray(), 0, val, S.length());
        
        return ans;
    }
    
    void permute(char[] S, int i, LinkedList<Character> temp, int len)
    {
        if(i >= len)
        {

            StringBuffer sb = new StringBuffer();
            for (char t : temp)
                
            {
                sb.append(t);
                
            }
            ans.add(sb.toString());
            return;
        }
        
        LinkedList<Character> tem = new LinkedList(temp);
                LinkedList<Character> tem1 = new LinkedList(temp);


            if(Character.isLetter(S[i]))
            {
                tem.add(Character.toLowerCase(S[i]));
                permute(S, i + 1, tem, len);
                tem1.add(Character.toUpperCase(S[i]));
                permute(S, i + 1, tem1, len);
            }
            else
            {
                tem.add(S[i]);
                permute(S, i + 1, tem, len);
            } 
    }
}