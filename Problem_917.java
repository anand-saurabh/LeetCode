//917. Reverse Only Letters
class Solution {
    public String reverseOnlyLetters(String S) {
        char arr[] = S.toCharArray();
        int len = S.length();
        int front = 0;
        int last = S.length() - 1;
        char temp;
        while(front <= last)
        {

            while(front < len &&  !(Character.isLetter(arr[front])))
            {
                front++;
            }
             while(last >= 0 && !(Character.isLetter(arr[last])))
            {
                last--;
            }
            if(front <= last)
            {
                temp = arr[front];
                arr[front] = arr[last];
                arr[last] = temp;  
                front++;
                last--;
            }
        }
        return new String(arr);
    }
}