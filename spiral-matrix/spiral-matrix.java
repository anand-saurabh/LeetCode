class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if(row == 0)
        {
            return new ArrayList();
        }
        int col = matrix[0].length;
                
        List<Integer>
            ans = new ArrayList();
        int top = 0;
        int right = col - 1;
        int bottom = row - 1;
        int left = 0;
        int count = 0;
        int i = top;
        
        while(count != (row * col))
        {
            i = left;
            while(i <= right)
            {
                ans.add(matrix[top][i]);
                count++;
                i++;
                
            }
            
            if(count == row * col)
                break;
            top++;
            i = top;
             while(i <= bottom)
            {
                ans.add(matrix[i][right]);
                                 count++;
                i++;
            }

                if(count == row * col)
                break;
            right--;
            i = right;
             while(top <= bottom && i >= left)
            {
                ans.add(matrix[bottom][i]);
                                 count++;

                i--;
            }
                if(count == row * col)
                break;

            bottom--;
            i = bottom;
             while(left <= right && i >= top)
            {
                ans.add(matrix[i][left]);
                                 count++;
                i--;
            }
                if(count == row * col)
                break;

            left++;  
            }
        
        return ans;
        
    }
    
    
}