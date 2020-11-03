class Solution {
    public int change(int amount, int[] coins) {
        int mem[][] = new int[coins.length + 1][amount + 1];
        for (int [] temp : mem)
        {
            for (int i = 0; i < temp.length; i++)
            {
                temp[i] = -1;
            }
        }
        return find(amount, amount, coins, mem, 0);
    }
    
    
    int find(int amount, int req, int [] coins, int[][]mem, int index)
    {
        
        if(req  < 0)
        {
            return 0;
        }
        
        if(mem[index][req] != -1)
        {
            return mem[index][req];
        }
       
        if(index >= coins.length)
        {
            if(req == 0)
                return 1;
            return 0;
        }
        
    
        
        int way1 =  find(amount, req - coins[index], coins, mem, index);
        int way2 =  find(amount, req, coins, mem, index + 1);

        mem[index][req] = way1 + way2;
        return mem[index][req];
    }
    
    
}