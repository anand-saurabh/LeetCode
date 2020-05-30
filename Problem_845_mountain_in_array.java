//Problem:845. Longest Mountain in Array

class Solution {
    public int longestMountain(int[] a) {
        boolean isIncrease = true;
        boolean isDecrease = false;
        int maxLen = 0;
        int leng = a.length;
        int incLen = 1;
        int decLen = 0;
        boolean didDec =  false;
        for (int i = 1; i < leng; i++)
        {
            //System.out.println("i val" + i);
            if(a[i-1] < a[i])
            {
                if(isIncrease)
                {
                    incLen++;
                }
                else
                {
                    if((incLen + decLen) > maxLen)
                    {
                         maxLen = incLen + decLen;
                    }
                    incLen = 2;
                    decLen = 0;
                    isIncrease = true;
                    isDecrease = false;
                }
            }
            else if (incLen > 1 && a[i-1] > a[i])
            {
                if(isDecrease)
                {
                    decLen++;
                }
                else
                {
                    decLen++;
                    isDecrease = true;
                    isIncrease = false;
                }
            }
            else if(a[i] == a[i-1])
            {
                if(incLen > 1 && decLen >= 1 && (incLen + decLen) > maxLen)
                {
                    maxLen = incLen + decLen;
                }
                isDecrease = false;
                isIncrease = true;
                incLen = 1;
                decLen = 0;
            }
        }
    
        if(incLen > 1 && decLen >= 1 && (incLen + decLen) > maxLen)
        {
            maxLen = incLen + decLen;
        }

        return maxLen;
    }
}