class Solution {
    int count = 0;
    public int numEnclaves(int[][] A) {
        
        int row = A.length;
        int col = A[0].length;
        
        int ans  = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(A[i][j] == 1)
                {
                    
                    if(!findPath(A, i, j , row, col))
                    {
                        ans += count;
                    }
                    count = 0;
                }
            }
        }
        return ans;
    }
    
    boolean findPath(int[][]A , int i, int j, int row, int col)
    {
        if(i < 0 || i >= row || j < 0 || j >= col)
        {
            return true;
        }
         if((i == row - 1 || j == col - 1 || i == 0 || j == 0) && A[i][j] == 1)
        {
            return true;
        }
        if(A[i][j] == -1)
        {
            return false;
        }
        
        if(A[i][j] == 0)
        {
            return false;
        }
        count++;
        A[i][j] = -1;
        boolean a = findPath(A, i + 1, j, row, col);
        boolean b = findPath(A, i, j + 1, row, col);
        boolean c = findPath(A, i - 1, j, row, col);
        boolean d =  findPath(A, i, j - 1, row, col);
        return a || b || c || d;
    }
}