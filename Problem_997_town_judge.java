//Problem_997. Find the Town Judge
class Solution {
    public int findJudge(int N, int[][] trust) {
        
        int row = trust.length;
        if(N == 1)
        {
            return N;
        }
        Map<Integer, Integer>
            trustMap = new HashMap();
        
        Set<Integer>
            others = new HashSet();
        for (int i = 0; i < row; i++)
        {
            trustMap.put(trust[i][1], trustMap.getOrDefault(trust[i][1], 0) + 1);
            others.add(trust[i][0]);
        }
        Set<Integer>
            keys = trustMap.keySet();
        
        for (int key : keys)
        {
            
            if(trustMap.get(key) == (N - 1) && !others.contains(key))
            {
                return key;
            }
        }
        return -1;
    }
}