905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i; int j = 0;
        int len = A.length - 1;
        i = len;
        int temp;
        while(j < i)
        {
        while(j < i && A[i] % 2 != 0)
        {
            i--;
        }
        while(j < i && A[j] % 2 == 0)
        {
            j++;
        }
         if(j < i)
         {
           temp = A[j];
             A[j] = A[i];
             A[i] = temp;
         }
        }
        return A;
    }
    
}