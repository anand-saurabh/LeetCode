class Solution {
    public int maximalSquare(char[][] input) {
        
        int row = input.length;
        int col = input[0].length;

        int max = 0;

        int table[][] = new int[row + 1][col + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (input[i-1][j-1] == '1') {
                    int min = Math.min(table[i - 1][j], table[i][j - 1]);
                    min = Math.min(min, table[i - 1][j - 1]);
                    table[i][j] = 1 + min;
                    if (table[i][j] > max) {
                        max = table[i][j];
                    }
                }
            }
        }
        return max * max;
        
    }
}