class Solution {
    
    List<List<Integer>> ans = new ArrayList();
     public List<List<Integer>> combinationSum2(int[] cand, int target) {
         
         Arrays.sort(cand);
         findSum(cand, target, 0, 0, new LinkedList(), cand.length);
         return ans;
         
     }
    
    void findSum(int[] cand, int target, int start, int cur, LinkedList<Integer> input,  int len)
    {
        
        if(cur > target)
        {
            return;
        }
        if(cur == target)
        {
                List<Integer>
                    temp = new ArrayList(input);
                ans.add(temp);
            return;
        }
        if(start >= len)
        {
            return;
        }
        
        for (int i = start; i < len; i++)
        {
            if(i != start && cand[i] == cand[i-1])
            {
                continue;
            }
            input.add(cand[i]);
            cur += cand[i];
            findSum(cand, target, i + 1, cur, input, len);
            input.removeLast();
            cur -= cand[i];
        }        
        
    }
    
