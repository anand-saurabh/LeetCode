class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int cols = A[0].length - 1;
        int [][] temp = new int[A.length][A[0].length];
        temp = A;
        int tem = 0;
        for (int i = 0; i < temp.length; i++)
        {
            
            int j = 0;
            int k = cols;
            while(j <= k)
            {
                if(temp[i][j] == 1)
                temp[i][j] = 0;
                else
                temp[i][j] = 1;
                if(j != k) {
                if(temp[i][k] == 1)
                {
                    temp[i][k] = 0;
                    
                }
                else
                {
                    
                    temp[i][k] = 1;
                }
                
                
                tem = temp[i][j];
                temp[i][j] = temp[i][k];
                temp[i][k] = tem;
                }
                j++;
                k--;
                
            }
        
           
            
        }
        
        
        return temp;
    }
}