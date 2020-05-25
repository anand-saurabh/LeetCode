//904. Fruit Into Baskets

// sliding window
class Solution {
    public int totalFruit(int[] tree) {
        
        int start = 0;
        Set<Integer>
            numSet = new HashSet();
        int length = tree.length;
        int i = 0;
        int j = 0;
        int pos = 0;
        int max = 0;
        int key = 0;
        int len = 0;
        while(i < length)
        {
        while(i < length && (numSet.size() < 2 || 
                             (numSet.size() == 2 && numSet.contains(tree[i]))))
        {
            numSet.add(tree[i]);
            ++len;
            ++i;
        }

            if(len > max)
            {
                max = len;
            }
            if(i < length)
            {
                j = i - 1;
                key = tree[i-1];
                while(j >= 0 && tree[j] == key)
                {
                    --j;
                }
                len = i - j - 1;

                start = j + 1;
                numSet.remove(tree[j]);
            }
        }
        if(len > max)
            max = len;
        return max;
        
    }
}