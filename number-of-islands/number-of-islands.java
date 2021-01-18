class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid == null || grid.length == 0 || grid[0].length == 0)
        {
            return 0;
        }
        boolean visited[][]  = new boolean[grid.length][grid[0].length];
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (boolean[] row: visited)
        Arrays.fill(row, false);
        int count = 0;
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if(grid[i][j] == '1' && visited[i][j] == false )
                {   
                    visited[i][j] = true;
                    traverseDfs(i, j, grid, visited, rows - 1, cols - 1);
                    count++;
                }
            }
        }
        return count;
    }
    void traverseDfs(int i, int j, char[][] grid, boolean visited[][], int rows, int cols)
    {
        
            if((j >= 1) && visited[i][j-1] != true && grid[i][j-1] == '1')
            {
                visited[i][j-1] = true;
                traverseDfs(i, j-1, grid, visited, rows, cols);
            }
            if(j < cols && visited[i][j+1] != true && grid[i][j+1] == '1')
            {
                visited[i][j+1] = true;   
                traverseDfs(i, j+1, grid, visited, rows, cols);
            }
            if(i < rows && visited[i+1][j] != true && grid[i+1][j] == '1')
            {   
                visited[i+1][j] = true;   
                traverseDfs(i+1, j, grid, visited, rows, cols);
            }
            if(i >= 1 && visited[i-1][j] != true && grid[i-1][j] == '1')
            {   
                visited[i-1][j] = true;   
                traverseDfs(i-1, j, grid, visited, rows, cols);
            }
    }
    
}
