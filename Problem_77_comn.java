class Solution {
    List<List<Integer>> ans = new ArrayList();
    
    public List<List<Integer>> combine(int n, int k) {
        int[] in = new int[n];
        for (int i = 1; i <= n; i++)
        {
            in[i-1] = i;
        }
        findComb(in, 0, n, new ArrayList(), k);
        return ans;
    }
    
    void findComb(int[] input, int i, int len, List<Integer> temp, int k)
    {
        if(i >= len || temp.size() == k)
        {
            return;
        }
        List<Integer>
            temp1 = new ArrayList(temp);
        temp.add(input[i]);
        
        if(temp.size() == k)
        {
            ans.add(temp);
        }
        findComb(input, i + 1, len, temp1, k);
        findComb(input, i + 1, len, temp, k);
    }
}