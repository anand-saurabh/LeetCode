class Solution {
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        
        int len = str.length();
        char c;
        for (int i = 0; i < len; i++)
        {
            c = str.charAt(i);
            if(65 <= c  && c <= 91 )
            {
                c = (char)(str.charAt(i) + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}