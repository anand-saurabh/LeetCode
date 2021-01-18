class Solution {
    public int numIslands(char[][] grid) {
        
        Queue<Integer>
            q = new LinkedList();
        
        int row = grid.length;
        int col = grid[0].length;
        
        int count = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    q.offer(i * col + j);
                    grid[i][j] = '0';
                    while (!q.isEmpty())
                    {
                        int temp = q.poll();
                        
                        int x = temp/col;
                        int y = temp % col;
                        
                        if(x + 1 < row && grid[x+1][y] == '1')
                        {
                            grid[x + 1][y] = '0';
                            q.offer((x + 1) * col + y);
                        }
                        if(y + 1 < col && grid[x][y+1] == '1')
                        {
                            grid[x][y+1] = '0';
                            q.offer((x * col) + y + 1);
                        }
                        
                        if(y - 1 >= 0 && grid[x][y-1] == '1')
                        {
                            grid[x][y - 1] = '0';
                            q.offer((x * col) + y - 1);
                        }
                        if(x - 1 >= 0 && grid[x - 1][y] == '1')
                        {
                            grid[x - 1][y] = '0';
                            q.offer(((x  - 1)* col) + y);
                        }
                    }
                }
                
            }
        }
        
        return count;
        
    }
}