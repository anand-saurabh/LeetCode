class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       
        for (int i = 0; i < flowerbed.length && n > 0; i++)
        {
            if(flowerbed[i] == 0)
            {
                if((i > 0 && flowerbed[i-1] == 1) || (i < (flowerbed.length - 1) && flowerbed[i+1] == 1))
                {
                    continue;
                }
                else
                {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            
        }
        if(n == 0)
        {
            return true;
        }
        return false;
        
    }
}