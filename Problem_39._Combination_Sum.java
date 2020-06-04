//Problem: 39. Combination Sum
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet();
        List<List<Integer>>
            ansToReturn = new ArrayList();
        int len = candidates.length;
        List<Integer> temp = new ArrayList();
        combinations(candidates, target, 0, 0, temp, ans,len);
        for (List<Integer> tempo : ans)
        {
            ansToReturn.add(tempo);
            
        }
        return ansToReturn;
        
    }
    public void combinations(int [] candidates, int target, int sum, int i, List<Integer> temp, Set<List<Integer>> list, int len)
    {
        if(sum == target)
        {
            list.add(temp);
        }
        if((sum > target) || (i >= len))
        {
            return;
        }
        List<Integer> newList = new ArrayList();
        newList.addAll(temp);
        newList.add(candidates[i]);
        

        List<Integer> newList1 = new ArrayList();
        newList1.addAll(newList);

        combinations(candidates, target, sum + candidates[i], i + 1, newList, list, len);
        combinations(candidates, target, sum, i + 1, temp, list, len);
        combinations(candidates, target, sum + candidates[i], i, newList1, list, len);

    }
}