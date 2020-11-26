class Solution {
    int min = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length][grid[0].length];
       
        for (int [] r : memo)
        {
            Arrays.fill(r, Integer.MAX_VALUE);
        }
        return pathSum(0,0,grid.length, grid[0].length, grid, memo);
        
    }
    
    
    int pathSum(int i, int j, int row, int col, int[][]grid, int[][] mem)
    {
        
        if(i >= row || j >= col)
        {
            return Integer.MAX_VALUE;
        }

        if(i == row -1 && j == col - 1)
        {
            return grid[i][j];
        }
    
        if(mem[i][j] != Integer.MAX_VALUE)
        {
            return mem[i][j];
        }
        
        
        int l1 = grid[i][j] + pathSum(i+1, j, row, col, grid, mem);
        int l2 = grid[i][j] + pathSum(i, j+1, row , col, grid, mem);
        
        if(l1 < 0)
        {
            l1 = Integer.MAX_VALUE;
        }
        if(l2 < 0)
        {
            l2 = Integer.MAX_VALUE;
        }
        
        mem[i][j] = Math.min(l1,l2);
        return mem[i][j];
    }
    
   
}
    