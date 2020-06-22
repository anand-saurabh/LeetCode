//Problem:64. Minimum Path Sum
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
    
    
    int pathSum(int i, int j, int row, int col, int[][] grid, int [][] memo)
    {
        
        if(i >= row ||  j >= col)
        {
            return Integer.MAX_VALUE;
        }
        if(memo[i][j] != Integer.MAX_VALUE)
        {
            return memo[i][j];
        }
        if(i == row -1 && j == col - 1)
        {
            return grid[i][j];
        }
        int min = Math.min(pathSum(i, j+1, row, col, grid, memo), 
                                     pathSum(i+1, j, row, col, grid, memo));
        // System.out.println("I:"+i+", J:"+j + ",min" + min);
        memo[i][j] = min + grid[i][j];
        return memo[i][j];
    }
}
    