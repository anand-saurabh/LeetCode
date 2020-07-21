class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int i = 0;
        int j = row - 1;
        int temp = 0;
        
        while(i < j)
        {
            for (int k = 0; k < col; k++)
            {
                temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }
        for (i = 0; i < row; i++)
        {
            for (j = i + 1; j < col; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}