class Solution {
    List<List<Integer>>
        ans = new ArrayList();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] input = {1,2,3,4,5,6,7,8,9};
        findSum(input, n, 0, 0, new LinkedList(), 9, k);
        return ans;
    }
    
    
    void findSum(int[] cand, int target, int start, int cur, LinkedList<Integer> input,  int len, int siz)
    {
        
        if(cur > target || input.size() > siz)
        {
            return;
        }
        if(cur == target && input.size() == siz)
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
            findSum(cand, target, i + 1, cur, input, len, siz);
            input.removeLast();
            cur -= cand[i];
        }        
        
    }
    
}