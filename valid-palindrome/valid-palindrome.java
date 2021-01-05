class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
        }
        String input1 = sb.toString().toLowerCase();
        String input2 = sb.reverse().toString().toLowerCase();
        
         if(input1.equals(input2))
           {
               return true;
           }
           else
           {
           return false;
           }
    }
}
