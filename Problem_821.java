class Solution {
    public int[] shortestToChar(String S, char C) {
        
        int prev = -1;
        int len = S.length();
        
        int ans[] = new int[len];
        
        char ch; 
        int k = 0;
        for (int i = 0; i < len; i++)
        {
            ch = S.charAt(i);
            if(ch == C)
            {
                if(prev == -1)
                {
                    k = 0;
                    while(k < i)
                    {
                       ans[k] = i - k;
                        k++;
                    }
                    
                }
                else
                {
                    for (k = prev + 1; k < i; k++)
                    {
                        ans[k] = Math.min(Math.abs(k- prev), i - k);
                    }
                }
                ans[i] = 0;
                prev = i;
            }
            else
            {
                if(prev != -1)
                {
                    ans[i] = i - prev;
                }  
            }
        }
        return ans;
    }
}