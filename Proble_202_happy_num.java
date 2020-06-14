
//202. Happy Numberclass Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet();
        int temp = n;
        int sum = 0;
        int digit;
        int prev = 0;
        while(true)
        {
            sum = 0;
            while(temp != 0)
            {
                digit = temp %10;
                sum += digit * digit;
                temp = temp/10;
            }
            temp = sum;
            if(prev == sum)
            {
                break;
            }
            prev = sum;
            if(set.contains(sum))
            {
                break;
            }
            else
            {
                set.add(sum);
            }
        }
        if(sum == 1)
        {
            return true;
        }
        return false;
    }
}