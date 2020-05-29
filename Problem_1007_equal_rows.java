//1007. Minimum Domino Rotations For Equal Row
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if(A == null || A.length == 0 || B == null || B.length == 0)
        {
            return -1;
        }
        if(A.length != B.length)
        {
            return -1;
        }
        int key1 = A[0];
        int key2 = B[0];
        int count1 = 0;
        int count2 = 0;
        int len = A.length;

        for (int i = 1; i < len; i++)
        {
            if(A[i] == key1 || B[i] == key1)
            {
                count1++;
            }
            if(A[i] == key2 || B[i] == key2)
            {
                count2++;
            }
        }

        if(count1 != len - 1 && count2 != len - 1)
        {
            return -1;
        }
        
        int key = count1 == len - 1 ? key1 : key2;
        
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < len; i++)
        {
            if(A[i] != key)
            {
                ans1++;
            }
            if(B[i] != key)
            {
                ans2++;
            }
        }
        return ans1 < ans2 ? ans1: ans2;    
        
    }
}