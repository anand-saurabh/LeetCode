class Solution {
    public int minPathSum(int[][] grid) {
        int [][] mem = new int[grid.length][grid[0].length];
        return findMin(grid, 0, 0, grid.length, grid[0].length, mem);
        
    }
    
    
    public int findMin(int[][] g, int i, int j, int r, int c, int[][]mem)
    {
        if(i >= r || j >= c)
        {
            return Integer.MAX_VALUE;
        }
        
        if(i == r - 1 && j == c - 1){
            return g[i][j];
        }
        
        if(mem[i][j] != 0)
        {
            return mem[i][j];
        }
        int down = findMin(g, i + 1, j, r, c, mem);
        int right = findMin(g, i, j + 1, r, c, mem);
        
        int min = Math.min(down, right);
        
        if(min == Integer.MAX_VALUE)
        {
            mem[i][j] = Integer.MAX_VALUE;
        }
        else
        {
            mem[i][j] = g[i][j] + min;
        }
​
        return mem[i][j];
        
    }
}
