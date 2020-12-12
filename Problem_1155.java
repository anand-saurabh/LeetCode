class Solution {
    int ans = 0;
    public int numRollsToTarget(int d, int f, int target) {
        double mem[][] = new double[d + 1][target + 1];
        for (int i = 0; i < mem.length; i++)
        {
            for (int j = 0; j < mem[0].length; j++)
            {
                mem[i][j] = -1;
            }
        }
        return (int)target(d, f, target, 0, 0, mem);
    }
    
    
    double target(int d, int f, int target, int cur, int count, double [][] mem)
    {
        
        if(cur > target || count > d)
        {
            return 0;
        }
        //System.out.println("count" + count + "cur" + cur);
        if(mem[count][cur] != -1)
        {
            return mem[count][cur];
        }
        
        if(count == d && cur == target)
        {
            mem[count][cur] = 1;
            return 1;
        }
        if(count == d)
        {
            mem[count][cur] = 0;
            return 0;
        }

        
        double ans = 0;
        for (int i = 1; i <= f; i++)
        {
            ans = (ans + target(d, f, target, cur + i, count + 1, mem)) % (Math.pow(10, 9) + 7);

        }
        mem[count][cur] = ans;
        return ans;
    }
}