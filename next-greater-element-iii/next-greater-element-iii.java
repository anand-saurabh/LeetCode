class Solution {
    public int nextGreaterElement(int n) {
        
        String input = String.valueOf(n);
        
        char temp [] = input.toCharArray();
        
        int len = input.length();
        int tem  = -1;
        int pos = -1;
        
        for (int i = len - 2; i >= 0; i--)
        {
            if(Integer.parseInt(Character.toString(temp[i+1])) >
               Integer.parseInt(Character.toString(temp[i])))
            {
                tem = Integer.parseInt(Character.toString(temp[i]));
                pos = i;
                break;
            } 
        }
        int swap = 0;
        
        if(pos != -1)
        {
            int min = Integer.MAX_VALUE;
            
            for (int i = pos + 1; i < len; i++)
            {
                if(Integer.parseInt(Character.toString(temp[i])) > tem && 
                   Integer.parseInt(Character.toString(temp[i])) < min)
                {
                    min = Integer.parseInt(Character.toString(temp[i]));
                    swap = i;
                }
            }
        }
        else
        {
            return -1;
        }
        char t = temp[pos];
        temp[pos] = temp[swap];
        temp[swap] = t;
        
        Arrays.sort(temp, pos + 1, temp.length);

        
        String ans = new String(temp);
        long toReturn = Long.parseLong(ans);
        if(toReturn > Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return (int)toReturn;
        }  
    }
}