class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int start = 0;
        int cur = 0;
        int tot = 0;
        int gasTot = 0;
        for (int i = 0; i < cost.length;i++)
        {
            tot += cost[i];
            gasTot += gas[i];
            if(cur + gas[i] >= cost[i])
            {
                cur += gas[i] - cost[i];
            }
            else
            {
                start = i + 1;
                cur = 0; 
            }
        }
        return  gasTot >= tot ? start : -1;
        
    }
}