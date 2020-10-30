class Solution {
    public int numDistinctIslands(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        Set shapes = new HashSet<HashSet<Integer>>();

        int ans = 0;
        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 1)
                {
                    Set<Integer> ob = new HashSet<Integer>();

                    find(grid, row, col, i, j, ob, i, j);
                    shapes.add(ob);
                }
            }  
        }
    
        return shapes.size();
    }
    
    void find(int grid[][], int row, int col, int cordX , int cordY, Set<Integer> set, int ro, int co)
    {
        if(cordX >= row || cordX < 0 || cordY >= col || cordY < 0 || grid[cordX][cordY] == -1 || grid[cordX][cordY] == 0)
        {
            return;
        }
        
        grid[cordX][cordY] = -1;
        set.add((cordX - ro) * 2 * grid[0].length + (cordY - co));
        find(grid, row, col, cordX - 1, cordY, set, ro, co);
        find(grid, row, col,cordX, cordY + 1, set, ro, co);
        find(grid, row, col, cordX, cordY - 1, set, ro, co);
        find(grid, row, col, cordX + 1, cordY, set, ro, co);
    }
    
    class Coordinate
    {
        
        int coordX;
        int coordY;
        Coordinate(int x, int y)
        {
            coordX = x;
            coordY = y;
        }
        public int hashCode()
        {
            return 1000 * coordX + coordY;
        }
        
         public boolean equals(Coordinate obj)
        {
             if(coordX == obj.coordX && coordY == obj.coordY)
                 return true;
             else
                 return false;
        } 
    }
}