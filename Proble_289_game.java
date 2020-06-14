//Problem: 289. Game of Life
class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int r = 0;
        int copy[][] = new int[row][col];
        for(int i = 0; i < row; i++)
        copy[i] = board[i].clone();
        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                    dfs(board, i, j, row, col, copy);
            }
        }
        r = 0;
        for(int i = 0; i < row; i++)
            board[i] = copy[i].clone();
    }
    
    
    public void dfs(int [][] b, int i, int j, int row, int col, int [][] copy)
    {
        if(i< 0 || i >= row || j < 0 || j >= col)
        {
            return;
        }
        
        int sum = check(b, i-1, j,row, col) + check(b, i+1, j, row, col) + check(b, i, j-1, row, col)
            + check(b, i, j+1, row, col) + check(b, i-1, j-1, row, col) + check(b, i+1, j+1, row, col)
            + check(b, i-1, j+1, row, col) +check(b, i+1, j-1, row, col);
        if(b[i][j] == 1)
        {
            if(sum  < 2 || sum > 3) {
                copy[i][j] = 0;
            }
        }
        else
        {
            if(sum == 3)
            {
                copy[i][j] = 1;
            }
        }
    }
    
    int check(int [][] b, int i, int j, int row, int col)
    {
        if(i < 0 || j < 0 || i >= row || j >= col)
        {
            return 0;
        }
        if(b[i][j] == 1)
        {
            return 1;
        }
        
        return 0;
    }
}