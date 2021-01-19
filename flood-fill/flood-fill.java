class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0)
        {
            return image;
        }
        boolean [][] visited = new boolean[image.length][image[0].length];
        int row = image.length;
        int col = image[0].length;
        for (boolean[] rowInput : visited)
        Arrays.fill(rowInput, false);
        visited[sr][sc] = true;
        int color = image[sr][sc];
        image[sr][sc] = newColor;
        dfs(image, sr, sc, color,visited, row - 1, col - 1, newColor);
        return image;
        
        
    }
        
        void dfs(int[][] image, int i, int j, int color, boolean [][] visited, int row, int col, int newColor)
        {
            
            if(i >= 1 && image[i-1][j] == color && visited[i-1][j] == false)
            {
                visited[i-1][j] = true;
                image[i-1][j] = newColor;
                dfs(image, i-1,j,color,visited,row,col, newColor);
            }
            if(i < row  && image[i+1][j] == color && visited[i+1][j] == false)
            {
                visited[i+1][j] = true;
                image[i+1][j] = newColor;
                dfs(image, i+1,j,color,visited,row,col, newColor);
            }
            if(j >= 1 && image[i][j-1] == color && visited[i][j-1] == false)
            {
                visited[i][j-1] = true;
                image[i][j-1] = newColor;
                dfs(image, i,j-1,color,visited,row,col, newColor);
            }
            if(j < col  && image[i][j+1] == color && visited[i][j+1] == false)
            {
                visited[i][j+1] = true;
                image[i][j+1] = newColor;
