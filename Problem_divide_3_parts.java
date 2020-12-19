class Solution {
    
     public boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum(), part = 0, average = sum / 3, cnt = 0;
        for (int a : A) {
            part += a;
            if (part == average) { // find the average: sum / 3
                ++cnt; // find an average, increase the counter.
                part = 0; // reset part.
            }
        }
        return cnt >= 3 && sum % 3 == 0;
    } 
    
    /*
    public boolean canThreePartsEqualSum(int[] A) {
        
        int i = 0;
        int j = A.length - 1;
        
        int tot = 0;
        
        while(i <= j)
        {
            tot += A[i++];
        }
        if(tot % 3 != 0)
        {
            return false;
        }
        int part = tot/3;
        
        i = 0;
        int cur = 0;
        int count = 0;
        while(i <= j)
        {
            cur += A[i++];
            System.out.println("cur" + cur);
            if(cur == part)
            {
                cur = 0;
                count++;
            }
        }
        if(count == 3 && tot != 0 )
        {
            return true;
            
        }
        if(count >= 3 && tot == 0 )
        {
            return true;
            
        }
        return false;
    }*/
}