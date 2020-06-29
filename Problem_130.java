//Problem 130. Surrounded Regions
class Solution {
    public void solve(char[][] board) {
        
    if (board == null || board.length == 0 || board[0].length == 0) 
        return;
    int row = board.length;
        int col = board[0].length;
        
        int visited[][] = new int[row][col];
        for (int a[] : visited)
        {
            Arrays.fill(a, 0);
        }
        boolean ans = false;
        for(int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
               if(board[i][j] == 'O' && visited[i][j] == 0)
               {
                   ans = dfs(board, i, j , row, col, visited);
                   if(ans)
                   {
                       fill(board, visited, row, col);
                   }
                   else
                   {
                       fillXs(board, visited, row, col);
                   }
               }
            }
        }
    }
    
    void fillXs(char [][] matrix, int [][] visited, int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(visited[i][j] == 1)
                {
                    matrix[i][j] = 'X';
                    visited[i][j] = -1;
                }
                
            }
        }
    }
    
     void fill(char [][] matrix, int [][] visited, int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(visited[i][j] == 1)
                {
                    visited[i][j] = -1;
                }   
            }
        }
    }
    
    boolean dfs(char [][] matrix, int i, int j, int row, int col, int [][] visited){
        if(i < 0 || i >= row || j < 0 || j >= col)
        {
            return false;
        }
        if(visited[i][j] == 1 || visited[i][j] == -1)
        {
            return false;
        }
        if(matrix[i][j] == 'X')
        {
            return false;
        }
        visited[i][j] = 1;
        if((i == 0 || j == 0 || i == row -1 || j == col - 1))
        {
            return true;
        }
            return dfs(matrix, i - 1, j, row, col, visited) || dfs(matrix, i + 1, j, row, col,visited)
                || dfs(matrix, i, j-1, row, col,visited) || dfs(matrix, i , j+1, row, col,visited);
        }
}