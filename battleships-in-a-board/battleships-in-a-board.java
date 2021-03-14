class Solution {
    
    public int countBattleships(char[][] board) {
        int len = board.length;
        int len1 = board[0].length;
        
        int ans =0;
        
        for (int i=0; i<len; i++) {
            for (int j=0; j<len1; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i-1][j] == 'X') continue;
                if (j > 0 && board[i][j-1] == 'X') continue;
                ans++;
            }
        }
        return ans;
    }
    
}