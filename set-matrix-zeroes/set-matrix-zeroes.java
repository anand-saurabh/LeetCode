class Solution {
    static final int max = -1281;
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Boolean visited [][] = new Boolean[row][col];
    
        
          for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                
                if(matrix[i][j] == 0)
                {
                    makeZeroesDFS(matrix, row, col, i, j, visited);
                }
            }
         }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
               if(matrix[i][j] == max)
                matrix[i][j] = 0;
            }
        }
        
    }
    
    
    void makeZeroesDFS(int [][] matrix, int row, int col, int i, int j, Boolean [][] visited)
    {
        if(i < 0 || i >= row || j < 0 || j >= col)
        {
            return;
        }
        visited[i][j] = true;
        matrix[i][j] = -1;
​
        int m;
            for (m = 0; m < col; m++)
            {
                if(matrix[i][m] == 0 && (visited[i][m] == null || visited[i][m] != true))
                {
                  makeZeroesDFS(matrix, row, col, i, m, visited);  
                }
               matrix[i][m] = max;
            }
            for (m = 0; m < row; m++)
            {
                 if(matrix[m][j] == 0 && (visited[m][j] == null || visited[m][j] != true))
                {
                  makeZeroesDFS(matrix, row, col, m, j, visited);  
                }
                matrix[m][j] = max;
            }
    }
}
