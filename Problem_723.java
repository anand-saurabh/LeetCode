class Solution {
    public int[][] candyCrush(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        
        boolean crush = true;
        
        while(crush)
        {
            crush = false;
            for (int i = 0; i < row - 2; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    int key = Math.abs(board[i][j]);
                    if(key == 0)
                    {
                        continue;
                    }
                    if(Math.abs(board[i+1][j]) == key && Math.abs(board[i+2][j]) == key)
                    {
                        board[i][j] = board[i+1][j] = board[i+2][j] = - key;
                        crush = true;
                    }
                }
            }
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col - 2; j++)
                {
                    int key = Math.abs(board[i][j]);
                    if(key == 0)
                    {
                        continue;
                    }
                    if(Math.abs(board[i][j+1]) == key && Math.abs(board[i][j+2]) == key)
                    {
                        board[i][j] = board[i][j+1] = board[i][j+2] = -key;
                        crush = true;
                        
                    }
                }
            }
            
            for (int i = 0; i < col; i++)
            {
                int wr = row - 1;
                 for (int r = row -1; r >= 0; --r)
                 {
                     if(board[r][i] > 0)
                     {
                         board[wr--][i] = board[r][i];
                     }
                 }
                
                while(wr >= 0)
                {
                    board[wr--][i] = 0;
                }
                 
            }    
            
        }
        
        return board;
        
    }
}