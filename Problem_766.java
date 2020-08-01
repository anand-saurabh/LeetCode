class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
     
        if(matrix.length == 0)
        {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        
        int tempRow;
        int tempCol;
        int prev;
        for (int i = 0; i < col; i++)
        {
            tempRow = 0;
            tempCol = i;
            prev = matrix[tempRow][tempCol];
            while(tempRow < row && tempCol < col)
            {
                if(matrix[tempRow][tempCol] != prev)
                {
                    System.out.print("ff");
                    return false;
                }
                tempRow++;
                tempCol++;
            }
        }
        
        for (int i = 1; i < row; i++)
        {
            tempCol = 0;
            tempRow = i;
            prev = matrix[tempRow][tempCol];
            while(tempRow < row && tempCol < col)
            {
                if(matrix[tempRow][tempCol] != prev)
                {
                    return false;
                }
                tempRow++;
                tempCol++;
            }
        }
        return true;
    }
}