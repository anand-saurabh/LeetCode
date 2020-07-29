class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
            int rows = matrix.length;
        if(rows == 0)
        {
            return new int[0];
        }
        int cols = matrix[0].length;
        if(cols == 0)
        {
            return new int[0];
        }
    
        int ans[] = new int[rows*cols];
        int tot = rows*cols;
        int count = 0;
        int row = 0;
        int col = 0;
        int index = 0;
        int total = 0;
        int temp = 0;
        while(total != tot)
        {
            
                row = 0;
                if(count < cols)
                col = count;
                else
                {
                    col = cols - 1;
                    temp += 1;
                    row = temp;
                }
            
            ArrayList<Integer> intermediate = new ArrayList<Integer>();
            while(row >= 0 && col >= 0 && row < rows && col < cols)
            {

                intermediate.add(matrix[row][col]);
                total++;
                row = row + 1;
                col = col - 1;
            }
            if(count % 2 == 0)
            {
                Collections.reverse(intermediate);
            }
            for (int i = 0; i < intermediate.size(); i++)
            {
                ans[index] = intermediate.get(i);
                index += 1;
            }
            count++;
        }
        return ans;
    }
}