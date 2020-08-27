class Solution {
    int min = Integer.MAX_VALUE;
    public int minMutation(String start, String end, String[] bank) {
        int len = end.length();
        Set<String>
            set = new HashSet();
         for (int k = 0; k < bank.length; k++)
         {
             set.add(bank[k]);
         }
        
        mutate(end, 0, set,len, start, 0);
        if(min == Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }
    
    void mutate(String end, int i, Set<String> bank, int len, String cur, int count)
    {
        
        if(i >= len)
        {
            if(cur.equals(end))
            {
                if(count < min)
                {
                    min = count;
                }
            }
            return;
        }
        
        if(cur.equals(end))
        {
           if(count < min)
                {
                    min = count;
                } 
            return;
        }
        
        int size = bank.size();
        
        String key = "";
        
        Iterator itr = bank.iterator();
        
        while(itr.hasNext())
        {
            key = (String) itr.next();
            if(findDifference(cur.toCharArray(), key.toCharArray())
               && key.length() == len)
            {
                Set<String>
                    temp = new HashSet(bank);
                temp.remove(key);
                mutate(end, i+1, temp, len, key, count + 1);
                temp.add(key);
            }    
        } 
        
    }
    boolean findDifference(char[] a, char [] b)
    {
        
        int len = a.length;
        int count = 0;
        
        for (int m = 0; m < len; m++)
        {
            if(a[m] != b[m])
            {
                count++;
                if(count > 1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}