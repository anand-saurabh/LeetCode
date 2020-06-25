//Problem: 79. Word Search
import java.util.*;
class Solution {
    public boolean exist(char[][] board, String word) {        
        
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(recurse(board, word, i, j , board.length, board[0].length, 0, word.length(), 0))
                    {
                        return true;
                    }

                }   
            }   
        }
        return false;
    }
    
    boolean recurse(char[][] board, String word, int i, int j, int rows, int cols, int index, int len, int matched)
    {
         if(len == matched) 
        {
            return true;
        }
        if(i < 0 || i >= rows || j < 0 || j >= cols)
            return false;
        if(board[i][j] != word.charAt(index))
        {
            return false;
        }
        if(index >= len)
        {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans =  recurse(board,word, i + 1, j, rows, cols, index + 1, len, matched + 1) || recurse(board,word, i, j + 1, rows, cols, index + 1, len, matched + 1) || recurse(board,word, i - 1, j, rows, cols, index + 1, len, matched + 1) || recurse(board,word, i, j - 1, rows, cols, index + 1, len, matched + 1);
        board[i][j] = temp;
        return ans;
        }        
    }