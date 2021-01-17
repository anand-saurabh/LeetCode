class Solution {
    public boolean exist(char[][] board, String word) {
        
        int row = board.length;
        int col = board[0].length;
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    boolean ans =   findExist(board, i, j, row, col, 0, word);
                    if(ans)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
    
    boolean findExist(char[][] board, int i, int j, int row, int col, int index, String word)
    {
        if(i < 0 || j < 0 || i >= row || j >= col || board[i][j] =='0')
        {
            return false;
        }
        if(board[i][j] == word.charAt(index))
        {
            if(index == word.length() - 1)
            {
                return true;
            }
        }
        else
        {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '0';
        boolean returnVal = findExist(board, i+1, j, row, col, index + 1, word) || findExist(board, i, j+1, row, col, index + 1, word) || findExist(board, i-1, j, row, col, index + 1, word) || findExist(board, i, j-1, row, col, index + 1, word);
        board[i][j] = temp;
