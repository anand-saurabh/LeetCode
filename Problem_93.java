class Solution {
    public List<String> restoreIpAddresses(String s) {
        Set<String>
            ans = new HashSet();
        if(s.length() > 12)
        {
            return new ArrayList();
        }
        char c = '0';
        boolean onlyZero = true;
        for (int i = 0; i < s.length(); i++)
        {
            if(c != s.charAt(i))
            {
                onlyZero = false;
            }
        }
        if(onlyZero)
        {
            List<String>
                tem = new ArrayList();
            if(s.length() != 4)
            {
                return tem;
            }
            else
            {
                String st = "0.0.0.0";
                {
                    tem.add(st);
                    return tem;
                }   
            }
        }
        restoreIpAddresses(s, ans, 0, 0, String.valueOf(s.charAt(0)), s.length() + 3);
        List<String>
            returnVal = new ArrayList(ans);
        return returnVal;
    }
    
     public void restoreIpAddresses(String s, Set<String> ans, int count, int i, String first, int len) {
         if((i >= s.length() - 1) || count >= 3)
         {
             return;
         }
         String temp = s.substring(0, i+1) + "." + s.substring(i+1);
         //System.out.println("val " + temp);
         count = count + 1;
         if(count == 3)
         {
             String toAdd = check(temp);
             if(toAdd.length() > 0 && toAdd.startsWith(first) && toAdd.length() == len)
             {   
                 ans.add(toAdd);
             }
         }
         restoreIpAddresses(s, ans, count - 1, i + 1, first, len);
         restoreIpAddresses(temp, ans, count, i + 2, first, len);
    }
    
    String  check(String s)
    {
        //System.out.println(s);
        String [] split = s.split("\\.");
        if(split.length != 4)
        {
            return "";
        }
        StringBuffer sb = new StringBuffer();

        Long tempVal;
        for (String temp : split)
        {
            if(temp.length() > 10)
            {
                return "";
            }
            tempVal = Long.parseLong(temp);
            if(tempVal > Integer.MAX_VALUE)
            {
                return "";
            }
            if(temp.isEmpty() || !(Integer.parseInt(temp) >= 0 && Integer.parseInt(temp) <= 255))
            {
                return "";
            }
            sb.append(Integer.parseInt(temp));
            sb.append(".");
        }
        sb.setLength(sb.length() - 1);
    
        return sb.toString();
    }
}