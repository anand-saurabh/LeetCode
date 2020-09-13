class Solution {
    public int[][] diagonalSort(int[][] mat) {
     
        Map<Integer, PriorityQueue<Integer>>
            map = new HashMap();
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                if(map.containsKey(i-j))
                {
                    PriorityQueue<Integer>
                        temp = map.get(i-j);
                    temp.offer(mat[i][j]);
                    map.put(i-j, temp);
                }
                else
                {
                    PriorityQueue<Integer>
                        temp = new PriorityQueue<Integer>();
                    temp.add(mat[i][j]);
                    map.put(i-j, temp);
                }
            }
        }
         for (int i = 0; i < mat.length; i++) 
         {
             for (int j = 0; j < mat[0].length; j++)
             {
                 mat[i][j] = map.get(i-j).poll();
             }
         }
        return mat;
    }
}