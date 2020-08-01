class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        List<Integer> ans = new ArrayList();
        if (matrix.length == 0) {
            return ans;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int count = row * col;
        int cur = 0;
        int top = 0;
        int right = col - 1;
        int bottom = row - 1;
        int left = 0;
        
        while(cur != count)
        {
            for (int i = left; i <= right; i++)
            {
                ans.add(matrix[top][i]);
                cur++;
            }

                            top++;

            for (int i = top; i <= bottom; i++)
            {
                ans.add(matrix[i][right]);
                                cur++;


            }

                            right--;

            if(top <= bottom)
            {
            for (int i = right; i >= left; i--)
            {
                ans.add(matrix[bottom][i]);
                                cur++;


            }
            }
            bottom--;
            

            if(left <= right)
            {
             for (int i = bottom; i >= top; i--)
            {
                ans.add(matrix[i][left]);
                                 cur++;
            }
            }
            left++;
            }
    
        return ans;
    }
}