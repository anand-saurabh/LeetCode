class Solution {
              
        Map<Character, String>
            charMap = new HashMap();
        
    List<String>
        ans = new ArrayList();
    
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty())
        {
            return ans;
        }
     charMap.put('2', "abc");
    charMap.put('3', "def");
    charMap.put('4', "ghi");
    charMap.put('5', "jkl");
    charMap.put('6', "mno");
    charMap.put('7', "pqrs");
    charMap.put('8', "tuv");
    charMap.put('9', "wxyz");
    
        backtrack(digits, "", 0);
        return ans;
    }
    public void backtrack(String digits, String temp, int index)
    {
        if(index >= digits.length())
        {
            ans.add(new String(temp.toString()));
            return;
        }
        
        String tem = charMap.get(digits.charAt(index));
        for (int i = 0; i < tem.length(); i++)
        {
            backtrack(digits, temp + tem.charAt(i), index + 1);
        }
    }
}
