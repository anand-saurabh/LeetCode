//50. Pow(x, n)
class Solution {
    public double myPow(double x, int n) {
        if(n >= 0)
        return Math.pow(x, n);
        else
        { 
            if(n == -2147483648)
            {
                if(x == 1 || x == -1)
                return 1;
                else
                    return 0;
            }
            
            return 1/Math.pow(x, Math.abs(n));
        }
    }
}