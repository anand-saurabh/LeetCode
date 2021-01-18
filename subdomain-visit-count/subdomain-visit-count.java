class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer>
            countMap = new HashMap();
        
        List<String>
            ans = new ArrayList();
        if(cpdomains.length == 0)
        {
            return ans;
        }
        int freq = 0;
        String temp = "";
        String [] input = new String[3];
        int count = 0;
        int ind = 0;
        String key = "";
        int n = 0;
        String [] split = new String [2];
        for (int i = 0; i < cpdomains.length; i++)
        {
            split = cpdomains[i].split("\\s+");
            count = -1;
            temp = split[1];
            ind = temp.indexOf(".");
            input = new String[3];
            
            while(ind != -1)
            {
                input[++count] = temp;
                System.out.println("" + temp);
                temp = temp.substring(ind + 1);
                ind = temp.indexOf(".");
            }
            
            input[++count] = temp;
            for(int j = 0; j <= count; j++)
            {
                key = input[j];
                n = Integer.parseInt(split[0]);
            if(countMap.containsKey(key))
            {
                freq = countMap.get(key);
                countMap.put(key, freq + n);
            }
