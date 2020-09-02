class Solution {
    public int getMaximumGold(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < row ; i++)
        {
            for (int j = 0; j < col; j++)
            {
                temp = findGold(grid, row, col, i, j);
                if(temp > max)
                {
                    max = temp;
                }
            }
        }
        return max;
    }
    
    int findGold(int [][] grid, int row, int col, int i, int j)
    {
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 0 || grid[i][j] == -1)
        {
            return 0;
        }
        
        int val = grid[i][j];
        
        grid[i][j] = -1;
        int maxGold = 0;
        
        maxGold = Math.max(maxGold,  findGold(grid, row, col, i + 1, j));
        maxGold = Math.max(maxGold,  findGold(grid, row, col, i, j+1));
        maxGold = Math.max(maxGold,  findGold(grid, row, col, i-1, j));
        maxGold = Math.max(maxGold,  findGold(grid, row, col, i, j - 1));
        grid[i][j] = val;
        return val + maxGold;
    }
    
}