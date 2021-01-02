class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Compa());
        int ans = 0;
        for (int i = 0; i < costs.length/2; i++)
        {
            ans += costs[i][0] + costs[i+ costs.length/2][1];
            
        }
        return ans;
    }
    
    
}
​
class Compa implements Comparator<int[]>
{
    
    public int compare(int[] a, int[] b)
    {
        return (a[0] - a[1]) - (b[0] - b[1]);
    }
}
