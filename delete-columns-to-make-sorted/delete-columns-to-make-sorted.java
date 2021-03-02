class Solution {
    public int minDeletionSize(String[] A) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < A[0].length(); i++)
        {
            j = 0;
            while (j < A.length - 1)
            {
                if(A[j].charAt(i) > A[j+1].charAt(i))
                {
                    count++;
                    break;
                }
                j++;
            }
        }
        
        return count;
    }
}