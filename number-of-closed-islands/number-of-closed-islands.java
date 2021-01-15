class Solution {
    public int closedIsland(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;
    
        
        for (int i = 0; i < row; i++)
        {
            for  (int j = 0; j < col; j++) {
                if(grid[i][j] == 0)
                {
                    if(numIsland(grid, row, col, i, j))
                    {
                        ans += 1;
                    }
                }
            }
        }
        return ans;
    }
    
    public boolean numIsland(int[][] grid, int row, int col, int i, int j)
    {
        if((i == row - 1 || j == col - 1 || i == 0 || j == 0)  && grid[i][j] == 0)
        {
            return false;
        }
        if(i >= row || j >= col)
        {
            return true;
        }
        if(grid[i][j] == 1)
        {
            return true;
        }
        grid[i][j] = 1;
        boolean a = numIsland(grid, row, col, i + 1, j);
        boolean b = numIsland(grid, row, col, i , j + 1);
        boolean c = numIsland(grid, row, col, i - 1, j);
        boolean d = numIsland(grid, row, col, i, j - 1);
        return a && b && c && d;
        
    }
        
        
        
        
        
        
        
        
        
        
