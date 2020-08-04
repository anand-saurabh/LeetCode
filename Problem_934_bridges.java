//934. Shortest Bridge
class Solution {
    int ans = Integer.MAX_VALUE;
    public int shortestBridge(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int key = 2;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(A[i][j] == 1)
                {
                    findIsland(A, i, j, row, col, key);
                    key += 1;
                }
            }
        }
         for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(A[i][j] == 2)
                {
                    findNearest(A, i, j, row, col, 0, 2);
                }
            }
        }
        return ans;
    }
    
    void findIsland(int[][] A, int i, int j, int row, int col, int key)
    {
        if(i < 0 || j < 0 || i >= row || j >= col || A[i][j] == 2 || A[i][j] == 3 || A[i][j] == 0)
        {
            return;
        }
        A[i][j] = key;
        findIsland(A, i+1, j, row, col, key);
        findIsland(A, i, j+1, row,col, key);
        findIsland(A, i, j-1, row,col, key);

    }
    
    void findNearest(int [][]A, int i, int j, int row, int col, int count, int key)
    {
        if( i < 0 || j < 0 ||i >= row || j >= col || A[i][j] == 5)
        {
            return;
        }
        
        if(A[i][j] == 0)
        {
            A[i][j] = 5;
            findNearest(A, i+1, j, row, col, count + 1, key);
            findNearest(A, i, j + 1, row, col , count + 1, key);
            findNearest(A, i, j -1, row, col , count + 1, key);
            A[i][j] = 5;
        }
        else if(A[i][j] == 3)
        {
            if(ans > count)
            {
                ans = count;
            }
        }
        else
        {
            A[i][j] = 5;
            findNearest(A, i+1, j, row, col, count, key);
            findNearest(A, i, j + 1, row, col , count, key);  
            A[i][j] = 5;

        }
    }
    
}