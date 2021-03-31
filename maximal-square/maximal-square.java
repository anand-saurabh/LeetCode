public class Solution {
    public int maximalSquare(char[][] input) {
               int row = input.length;
        int col = input[0].length;
        int maxi = -1;
        int maxj = -1;
        int prev = 0;

        int max = 0;

        int table[] = new int[col + 1];
        int temp = 0;

        for (int i = 1; i <= row; i++) {
            prev = table[0];
            for (int j = 1; j <= col; j++) {
                if (input[i-1][j-1] == '1') {
                    temp = table[j];
                    table[j] = 1 + findMin(j, table, prev);
                    if (table[j] > max) {
                        max = table[j];
                        maxi = i - 1;
                        maxj = j - 1;
                    }
                }
                else
                {
                    table[j] = 0;
                }

                prev = temp;

            }
        }
        
        return max * max;   
    }
    
    static int findMin(int j, int table[], int prev)
    {
        int min = Math.min(table[j - 1], table[j]);
        min = Math.min(min, prev);
        return min;
    }
}