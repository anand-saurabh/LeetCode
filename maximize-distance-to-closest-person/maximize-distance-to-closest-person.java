class Solution {
    public int maxDistToClosest(int[] seats) {
        int len = seats.length;
        
        int []left = new int[len];
        int []right = new int[len];
        
        int pos = len;
        for (int  i = 0; i < len; i++)
        {
            if(seats[i] == 1)
            {
                pos = i;
                left[i] = 0;
            }
            else
            {
                if(pos < len)
                left[i] = i - pos;
                else
                    left[i] = pos;
                
            }
        }
        pos = len;
        for (int  j = len - 1; j >= 0; j--)
        {
            if(seats[j] == 1)
            {
                pos = j;
                right[j] = 0;
            }
            else
            {
                if(pos < len)
                right[j] = pos - j;
                else
                    right[j] = len;
                
            }
        }
