class Solution {
    int ans = 0;
    public int uniquePathsWithObstacles(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int mem[][] = new int[row][col];
        
        return findUnique(0,0,grid,row, col, mem);
    }
    
    private int findUnique(int i, int j, int[][] grid, 
                           int row, int col, int[][] mem)
    {
        if(i >= row || j >= col)
            return 0;
        if(mem[i][j] != 0)
        {
            return mem[i][j];
        }
            
        if(grid[i][j] == 1)
            return 0;
        if(i == row-1 && j == col - 1)
        {
            return 1;
            
        }
        
        int sum = findUnique(i, j+1, grid, row, col, mem) + 
            findUnique(i+1, j, grid, row , col, mem);
        mem[i][j] = sum;
        return sum;
    }
    
    
}
