//695. Max Area of Island

class Solution {
    int maxArea = 0;
    int cur = 0;
    public int maxAreaOfIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        boolean [][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(visited[i][j] == false && grid[i][j] == 1)
                {
                    cur = 0;
                    recurse(grid, i, j, row, col, visited);
                    if(cur > maxArea)
                    {
                        maxArea = cur;
                    }
                }
                
            }
        }
        return maxArea;
        
    }
    
    
    void recurse(int [][] grid, int i , int j, int row, int col, boolean[][] visited)
    {
        
        if(i < 0 || i >= row || j < 0 || j >= col || visited[i][j] || grid[i][j] == 0)
        {
            return;
        }
        
        visited[i][j] = true;
        cur++;
        recurse(grid, i + 1, j, row, col, visited);
        recurse(grid, i, j+1, row, col, visited);
        recurse(grid, i - 1, j, row, col, visited);
        recurse(grid, i, j - 1, row , col, visited);
        
    }
}