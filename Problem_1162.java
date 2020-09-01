
class Solution {

void dfs(int[][] g, int i, int j, int dist)
{
  if (i < 0 || j < 0 || i >= g.length || j >= g[0].length || (g[i][j] != 0 && g[i][j] <= dist)) return;
  g[i][j] = dist;
    dfs(g, i - 1, j, dist + 1);
    dfs(g, i + 1, j, dist + 1);
    dfs(g, i, j - 1, dist + 1);
    dfs(g, i, j + 1, dist + 1);
}
int maxDistance(int[][] g) {
    int mx = -1;
  for (int i = 0; i < g.length; ++i)
    for (int j = 0; j < g[i].length; ++j)
      if (g[i][j] == 1) {
          g[i][j] = 0;
          dfs(g, i, j, 1);
      }
  for (int i = 0; i < g.length; ++i)
    for (int j = 0; j < g[i].length; ++j)
      if (g[i][j] > 1) 
          mx = Math.max(mx, g[i][j] - 1);
  return mx;
}

}

/*
class Solution {
    int x_coord;
    int y_coord;
    public int maxDistance(int[][] grid) {
        
        int ans = -1;
        
        int row = grid.length;
        int col = grid[0].length;
        
        int[][] mem = new int[row][col];
        
        int max = Integer.MIN_VALUE;

        int cur;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(grid[i][j] == 0)
                {
                    cur = find(grid, i, j, row, col, mem);
                    
                    System.out.println("cur  max " + cur + max);
                    if(cur > max) {
                        max = cur;
                        ans = Math.abs(i - x_coord) + Math.abs(j - y_coord);
                    }
                }
            }
        }
        if(max == Integer.MIN_VALUE)
        {
            return -1;
        }
        return max;
    }
    
    int find(int[][] grid, int i, int j, int row, int col, int[][] mem)
    {
        
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 2)
        {
            return Integer.MAX_VALUE - 1;
        }
        if(mem[i][j] != 0)
        {
            return mem[i][j];
        }
        
        if(grid[i][j] == 1)
        {
            return 0;
        }
        grid[i][j] = 2;
        int max = Integer.MAX_VALUE;
        int prev = max;
        max = Math.min(max, 1+ find(grid, i, j+1, row, col, mem));
        
        prev = max;
        x_coord = i;
        y_coord = j + 1;
        max = Math.min(max, 1 + find(grid, i, j-1, row, col, mem));
        if(prev != max)
        {
            prev = max;
            x_coord = i;
            y_coord = j - 1;
        }
        max = Math.min(max, 1 + find(grid, i+1, j, row, col, mem));
        
         if(prev != max)
        {
            prev = max;
            x_coord = i+1;
            y_coord = j;
        }
        max = Math.min(max, 1 + find(grid, i-1, j, row, col, mem));
         if(prev != max)
        {
            prev = max;
            x_coord = i - 1;
            y_coord = j;
        }
        max = Math.min(max, 1 + find(grid, i+1, j+1, row, col, mem));
         if(prev != max)
        {
            prev = max;
            x_coord = i + 1;
            y_coord = j + 1;
        }
        
        max = Math.min(max, 1 + find(grid, i-1, j-1, row, col, mem));
         if(prev != max)
        {
            prev = max;
            x_coord = i - 1;
            y_coord = j - 1;
        }
        max = Math.min(max, 1 + find(grid, i-1, j+1, row, col, mem));
          if(prev != max)
        {
            prev = max;
            x_coord = i - 1;
            y_coord = j + 1;
        }
        max = Math.min(max, 1 + find(grid, i+1, j-1, row, col, mem));
          if(prev != max)
        {
            prev = max;
            x_coord = i + 1;
            y_coord = j - 1;
        }
        grid[i][j] = 0;
        mem[i][j] = max;
        return max;
    }
}
*/