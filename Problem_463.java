class Solution {
    public int islandPerimeter(int[][] grid) {
    
        int row = grid.length;
        int col = grid[0].length;
        
        int ans = 0;
        int count = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                count = 0;
                if(grid[i][j] == 1)
                {
                    if( i > 0)
                    {
                        if(grid[i-1][j] == 0)
                        {
                            count++;
                            
                        }
                    }
                     if( j > 0)
                    {
                        if(grid[i][j-1] == 0)
                        {
                            count++;
                            
                        }
                    }
                    
                      if( j < col - 1)
                    {
                        if(grid[i][j+1] == 0)
                        {
                            count++;
                            
                        }
                    }
                    
                      if( i < row - 1)
                    {
                        if(grid[i+1][j] == 0)
                        {
                            count++; 
                        }
                    }
                    if(j == 0)
                    {
                        count++;
                    }
                    if(j == col - 1)
                    {
                        count++;
                    }
                    
                    if(i == 0)
                    {
                        count++;
                    }
                    if(i == row - 1)
                    {
                        count++;
                    }
                    ans += count;
                }
            }
        }
        return ans;
    }
    
    
}