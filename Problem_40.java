class Solution {
    
     public List<List<Integer>> combinationSum2(int[] cand, int target) {
    Arrays.sort(cand);
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<Integer>();
    dfs_com(cand, 0, target, path, res);
    return res;
     }
    void dfs_com(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
    if (target == 0) {
        res.add(new ArrayList(path));
        return ;
    }
    if (target < 0) return;
    for (int i = cur; i < cand.length; i++){
        if (i > cur && cand[i] == cand[i-1]) continue;
        path.add(path.size(), cand[i]);
        dfs_com(cand, i+1, target - cand[i], path, res);
        path.remove(path.size()-1);
    }
}
    
    /*
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        List<List<Integer>> ansList = new ArrayList();

                LinkedList<Integer> list = new LinkedList<Integer>(); 

        Arrays.sort(cand);
        findSum(cand, cand.length, target, list, 0, ansList, 0);
        return ansList;
        
    }
    
    void findSum(int[] candid, int len, int target, LinkedList<Integer> ans, int start,List<List<Integer>> ansList, int cur)
    {
        
        if(cur == target)
        {
            ansList.add(new ArrayList(ans));
        }
        //1 1 2 3 
        for (int i = start; i < len; i++)
        {
            if(i != start && candid[i - 1] == candid[i])
            {
                continue;
            }
            ans.add(candid[i]);
            cur += candid[i];
            findSum(candid, len, target, ans, i + 1, ansList, cur);
            cur -= ans.removeLast();
        }
        
    }
    */

}