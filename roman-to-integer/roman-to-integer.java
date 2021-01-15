class Solution {
    public int romanToInt(String s) {
        
        int res = 0;
        int prev = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i))
            {
                case 'I' : cur = 1;
                    break;
                case 'V' : cur = 5;
                    break;
                case 'X' : cur = 10;                    
                    break;
                case 'L' : cur = 50;
                    break;
                case 'C' : cur = 100;
                    break;
                case 'D' : cur = 500;
                    break;
                case 'M' : cur = 1000;
                    break;
            }
                
            if(prev < cur)
            {
                res =  res - prev + (cur - prev);
                //System.out.println("less" + res);
            }
            else
            {
                res += cur;
                //System.out.println("great" + res);
​
            } 
            prev = cur;
        }
        return res;
    }
