class Solution {
    Integer ways[];
    Set<Integer>
        temp = new HashSet();
    
        public int climbStairs(int n) {
        ways = new Integer [n + 1];
        if(n == 0)
            return 0;
        ways[0] = 1;
        ways[1] = 1;
        return differentWays(n);      
    }
    
    int differentWays(int n)
    {
        if(n < 0)
        {
            return 0;
        }
        if(ways[n] != null)
        {
            return ways[n];
        }    
        int way1 = differentWays(n-1);
        int way2 = differentWays(n-2);
  

        ways[n] = way1 + way2;
        return ways[n];
    }
}