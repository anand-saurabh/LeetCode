//Problem:657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        
        int x = 0;
        int y = 0;
        int len = moves.length();
        
        char c;
        for (int i = 0; i < len; i++)
        {
            c = moves.charAt(i);
            switch(c)
            {
                case 'U' : ++y;
                    break;
                case 'D' : --y;
                    break;
                case 'L' : --x;
                    break;
                case 'R' : ++x;    
                    break;
            }
        }
        if(x == 0 && y == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}