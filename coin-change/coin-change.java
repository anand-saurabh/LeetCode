class Solution {
    
    int mem[][];
    public int coinChange(int[] coins, int amount) {
        mem = new int[coins.length][amount];
        int val = coinChange(coins, amount, 0, 0, coins.length);
        if(val == Integer.MAX_VALUE || val == Integer.MAX_VALUE - 1)
        {
            return -1;
        }
        return val;
    }
​
    int coinChange(int[] coins, int target, int amount, int index, int len) {
        if(amount > target || index >= len || amount < 0)
        {
            return Integer.MAX_VALUE - 1;
        }
        
        if(amount == target)
        {
            return 0;
        }
        
        if(mem[index][amount] != 0)
        {
            return mem[index][amount];
        }
        
        int min = Integer.MAX_VALUE;
        
        min = Math.min(min, 1 + coinChange(coins,  target, amount + coins[index], index + 1, len));
        min = Math.min(min, 1 + coinChange(coins,  target, amount + coins[index], index, len));
        min = Math.min(min, coinChange(coins,  target, amount, index + 1, len));
        
        mem[index][amount] = min;
        return min; 
    }
}
