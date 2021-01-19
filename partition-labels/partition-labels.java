class Solution {
    public List<Integer> partitionLabels(String S) {
        
        int[] index = new int[26];
        
        for (int i = 0; i < S.length(); i++)
        {
            index[S.charAt(i) - 'a'] = i; 
        }
        
        int j = 0;
        List<Integer>
            ans = new ArrayList();
        int start = 0;
        for (int i = 0; i < S.length(); i++)
        {
            j = Math.max(j, index[S.charAt(i) - 'a']);
            if (i == j)
            {
                ans.add(i - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
}
