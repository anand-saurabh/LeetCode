class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int findRow = 0;
        if(matrix[findRow][0] == target)
            return true;
        while(findRow < row && target > matrix[findRow][col-1])
        {
            findRow++;
        }
        
        if(findRow < 0 || findRow >= row)
        {
            return false;
        }

        for (int i = 0; i < col; i++)
        {
            if(matrix[findRow][i] == target)
            {
                return true;
            }
        }
        return false;
    }
}