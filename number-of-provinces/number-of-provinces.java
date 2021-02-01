class Solution {
    public int findCircleNum(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        int count = 0;
        boolean visited[][] = new boolean[rows][cols];
        for (int l = 0; l < rows; l++)
        {
            for (int m = 0; m < cols; m++)
            {
                if(M[l][m] == 1 && visited[l][m] != true){
                    dfs(M, visited, cols, l);
                    count++;
                
 //                   for (int k = 0; k < rows; k++)
//                     {
//                         for (int p = 0; p < cols; p++)
//                         {
//                             System.out.print(visited[k][p]);
                            
//                         }
//                                                     System.out.println();
//                     }
                }
            }
        }
        return count;
    }
    
    public void dfs(int[][] M, boolean [][] visited, int n, int i)
    {
        for (int j = 0; j < n; j++)
        {
            if(M[i][j] == 1 && visited[i][j] != true)
            {
                visited[i][j] = true;
                if(j != i)
                dfs(M, visited,n, j);
            }
        }
    }
}