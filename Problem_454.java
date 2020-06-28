//454. 4Sum II
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len1 = A.length;
        int len2 = B.length;
        int len3 = C.length;
        int len4 = D.length;
        
        int ans = 0;
        Map<Integer, Integer>
            map = new HashMap();
        
        for (int i = 0; i < len1; i++)
        {
            for (int j = 0; j < len2; j++)
            {
                map.put(A[i]+ B[j], map.getOrDefault(A[i]+ B[j], 0) + 1);
            }
        }
         for (int i = 0; i < len3; i++)
        {
            for (int j = 0; j < len4; j++)
            {
                if(map.containsKey(0 - (C[i] + D[j])))
                {
                    ans += map.get(0 - (C[i] + D[j]));
                }
            }
        }
        return ans;
    }
   
}