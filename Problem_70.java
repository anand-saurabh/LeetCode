class Solution {
        public int climbStairs(int n) {
            int [] mem = new int[n + 1];
            if(n == 1)
            {
                return 1;
            }
            mem[1] = 1;
            mem[2] = 2;
            return differentWays(n, mem);
            
            
    }
    
    int differentWays(int n, int [] mem)
    {
        if(n < 0)
        {
            return 0;
        }
        if(mem[n] != 0)
        {
            return mem[n];
        }
        if(n == 0)
        {
            return 1;
        }
        int a  = differentWays(n - 1, mem);
        int b = differentWays(n - 2, mem);
        
        mem[n] = a + b;
        return mem[n];
    }
}