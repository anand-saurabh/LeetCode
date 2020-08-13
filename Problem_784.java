class Solution {
    public List<String> letterCasePermutation(String S) {

                LinkedList<String> val = new LinkedList();

        
        permute(S.toCharArray(), 0, val, S.length());
        
        return val;
    }
    
    void permute(char[] S, int i, LinkedList<String> temp, int len)
    {
        
        if(i == len)
        {
            temp.add(new String(S));
            return;
        }
        
        
        if(Character.isLetter(S[i]))
        {
           S[i] = Character.toLowerCase(S[i]);
            permute(S, i+1, temp, len);
        S[i] = Character.toUpperCase(S[i]);
            permute(S, i+1, temp, len);

        }
        else
        {
            permute(S, i + 1, temp, len);
        }
    }
}