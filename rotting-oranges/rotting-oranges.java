class Solution {
    public int orangesRotting(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int changeCount = 1;
        int mins = 0;
        int [][] input = grid;
        int newGrid [][] = new int[row][col];
        while(changeCount > 0)
        {
            changeCount = 0;
            newGrid = makeCopy(input);
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    if(input[i][j] == 2)
                    {
                        if(i-1 >= 0 && input[i-1][j] == 1)
                        {
                            changeCount++;
                            newGrid[i-1][j] = 2;
                        }
                        if(i+1 < row && input[i+1][j] == 1)
                        {   changeCount++;
                            newGrid[i+1][j] = 2;
                        }
                         if(j+1 < col && input[i][j+1] == 1)
                        {
                            changeCount++;
                            newGrid[i][j+1] = 2;
                        }
                        if(j-1 >= 0 && input[i][j-1] == 1)
                        {
                             changeCount++;
                             newGrid[i][j-1] = 2;
                        }
                    }
                }
            }
            if(changeCount > 0)
            {
            input = newGrid;
            mins += 1;
            }
        }
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                
                if(newGrid[i][j] == 1)
                {
                    return -1;
                } 
            }
        }
        
        return mins;
    }
    
    private int[][] makeCopy(int [][] grid)
    {
        int [][] newGrid = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                newGrid[i][j] = grid[i][j];
           }
        }
        return newGrid;
    }
}
    
    
    
    
        