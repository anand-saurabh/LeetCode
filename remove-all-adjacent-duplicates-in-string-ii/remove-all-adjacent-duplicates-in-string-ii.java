class Solution {
     public String removeDuplicates(String s, int k) {
         int []count = new int[s.length()];
         StringBuffer sb = new StringBuffer();
         
         for (int i = 0; i < s.length(); i++)
         {
             sb.append(s.charAt(i));
             int last = sb.length() - 1;
             if(last > 0)
             {
                 if(sb.charAt(last) == sb.charAt(last-1))
                 {
                     count[last] = 1 + count[last-1];
                 }
                 else
                 {
                     count[last] = 1;
                 }
                 if(count[last] >= k)
                 {
                     sb.delete(last - k + 1, sb.length());
                 }
                 }
             else
             {
                 count[last] = 1;
             }
             
         }
         return sb.toString();
         
        }
}
