class Solution {
    
    List<List<Integer>>
        
        ans = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        findSubsets(nums, new ArrayList(), 0);
        return ans;
    }
    
    void findSubsets(int[] nums, List<Integer> temp, int index)
    {
        ans.add(new ArrayList(temp));
        
        List<Integer>
            tempo = new ArrayList(temp);
        for (int i = index; i < nums.length; i++)
        {
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            tempo.add(nums[i]);
            findSubsets(nums, tempo, i + 1);
            tempo.remove(tempo.remove(tempo.size() - 1));
        }
    }
}
