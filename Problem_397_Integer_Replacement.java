//Problem:397. Integer Replacement
class Solution {
    int ans = Integer.MAX_VALUE;
    public int integerReplacement(int n) {
        findMin(n, 0);
        return ans;
    }
    public void findMin(long cur, int count)
    {
        if(cur < 1)
        {
            return;
        }
        if(cur == 1)
        {
            if(ans > count)
            {
                ans = count;
            }
            return;
        }
        if(cur % 2 == 0)
        {
            findMin(cur/2, count + 1);
        }
        else
        {
            findMin(cur - 1, count + 1);
            findMin(cur + 1, count + 1);
        }
    }
    
}

// DP soltuion - better
class Solution {
    int ans = Integer.MAX_VALUE;
    public int integerReplacement(int n) {
        Map<Long, Long> mem = new HashMap();
        
        return (int)findMin(n, mem);
    }
    public long findMin(long cur, Map<Long, Long> mem)
    {
        if(cur < 1)
        {
            return 0;
        }
        if(cur == 1)
        {
            return 0;
        }
        if(mem.containsKey(cur))
        {
            return mem.get(cur);
        }
        if(cur % 2 == 0)
        {
            return 1 + findMin(cur/2, mem);
        }
        else
        {
            long a = 1 + findMin(cur - 1,mem);
            long b = 1 + findMin(cur + 1, mem);
            long min = a > b ? b : a;
            mem.put(cur, min);
            return min;
        }
    }
    
}