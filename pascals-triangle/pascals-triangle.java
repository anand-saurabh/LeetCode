class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer[]>
            temp = new ArrayList();
                List<List<Integer>>
            ans = new ArrayList();
        
        
        for (int i = 1; i <= numRows; i++)
        {
            Integer [] in
                 = new Integer[i];
            in[0] = 1;
            
            if(i > 1)
            {
                in[i - 1] = 1;
            }
            temp.add(in);
        }
        for (int i = 1; i < temp.size() - 1; i++)
        {
            Integer[]
                prev = temp.get(i);
            int pos = 0;
            Integer []
                tempo = temp.get(i+1);
            for (int j = 1; j < tempo.length - 1; j++)
            {
                Integer sum = prev[pos] + prev[pos+1];
                tempo[j] =  sum;
                pos += 1;
            }
        }
        for (int i = 0; i < temp.size(); i++)
        {
            ans.add(Arrays.asList(temp.get(i)));
        }
        return ans;
            
    }
