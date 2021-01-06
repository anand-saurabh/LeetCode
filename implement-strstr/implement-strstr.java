class Solution {
    public int strStr(String haystack, String needle) {
        
        int len = needle.length();
        if(len == 0)
        {
            return 0;
        }
        String temp = haystack;
        int j;
        int start = -1;
        int itr;
        int length;
        int inputLength = haystack.length();
        for (int i = 0; i < inputLength;i++)
        {
            if(temp.charAt(i) == needle.charAt(0))
            {
                length = 1;
                j = 1;
                itr = i + 1;
                start = i;
                while(itr < inputLength && j < len && (temp.charAt(itr) == needle.charAt(j)))
                {
                   itr++;
                   j++;
                   length++;        
                }
                if(length == len)
                {
                    return start;
                }
            }
        }
        return -1;
    }
}
