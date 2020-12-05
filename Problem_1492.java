//1492. The kth Factor of n
class Solution {
    public int kthFactor(int n, int k) {
        
        int limit = n/2;
        for (int i = 1; i <= limit; i++)
        {
            if((n % i) == 0)
            {
                k--;
                if(k == 0)
                {
                    return i;
                }
            }
        }
        if(k == 1)
        {
            return n;
            
        }
        else
        {
            return -1;
        }
    }
}