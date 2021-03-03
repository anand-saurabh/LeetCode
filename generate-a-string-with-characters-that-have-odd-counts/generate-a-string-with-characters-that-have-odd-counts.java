class Solution {
    public String generateTheString(int n) {
        StringBuffer sb = new StringBuffer();
        if(n <= 2)
        {
            int val = 97;
            for (int i = 0; i < n; i++)
            {
                sb.append((char)val);
                val++;
            }
            return sb.toString();
        }
        if(n % 2 == 0)
        {
            for (int i = 0; i < n - 1; i++)     
            {
                
                sb.append('a');
            }
            
        sb.append('b');
        }
        else 
        {
             for (int i = 0; i < n - 2; i++)     
            {
                
                sb.append('a');
            }
            
        sb.append('b');  
        sb.append('c');            

            
        }

    return sb.toString();
        
    }
}
