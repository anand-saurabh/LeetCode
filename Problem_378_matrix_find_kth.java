
//Problem: 378. Kth Smallest Element in a Sorted Matrix
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        
        PriorityQueue<Integer>
            pq = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                pq.offer(mat[i][j]);
                if(pq.size() > k)
                {
                    pq.poll();
                }
            }
        }
        return pq.poll();
    }
}