import java.util.*;
class Solution {
    public boolean exist(char[][] board, String word) {        
        
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(recurse(board, word, i, j , board.length, board[0].length, 0, word.length()))
                    {
                        return true;
                    }

                }   
            }   
        }
        return false;
    }
    
    boolean recurse(char[][] board, String word, int i, int j, int rows, int cols, int index, int len)
    {
        
        if(i < 0 || j < 0 || i >= rows || j >= cols || board[i][j] == '\t')
        {
            
            return false;
        }
        
        if(word.charAt(index) == board[i][j])
        {
            if(index == word.length() - 1)
            {
                return true;
            }
            index++;
        }
        else
        {
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '\t';
        
        boolean toReturn =  recurse(board, word, i + 1, j, rows, cols, index, len) || recurse(board, word, i - 1, j, rows, cols, index, len) || recurse(board, word, i, j - 1, rows, cols, index, len)  || recurse(board, word, i, j + 1, rows, cols, index, len);
        
        board[i][j] = temp;
        return toReturn;
    }
}