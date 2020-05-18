// Problem 62. Unique Paths

class Solution {
    public int uniquePaths(int m, int n) {
        int [][] mem = new int[m][n];
        for (int[] a: mem)
        {
            Arrays.fill(a, -1);
            
        }
        return findNumPath(0, 0, m, n, mem);
    }
    
    int findNumPath(int i, int j, int row, int col, int[][] mem)
    {
        if(i < 0 || i == row || j < 0 || j == col)
        {
            return 0;
              
        }
        if(mem[i][j] != -1)
        {
           return mem[i][j]; 
        }
        if(i == row - 1 && j == col - 1)
        {
            return 1;
        }
        int a = findNumPath(i+1, j, row, col, mem);
        int b = findNumPath(i, j+1, row, col, mem);
        mem[i][j] = a+b;
        return a + b;
    }
}