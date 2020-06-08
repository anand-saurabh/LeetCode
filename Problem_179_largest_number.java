//Problem: 179. Largest Numberclass Solution {
    public String largestNumber(int[] nums) {
     
        String[] input = new String[nums.length];
        boolean isZero = true;
        for (int i = 0; i < nums.length; i++)
        {
            input[i] = String.valueOf(nums[i]);
            if(Integer.parseInt(input[i]) != 0)
            {
                isZero = false;
            }
        }
        Arrays.sort(input, new NumComparator());
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length; i++)
        {
            sb.append(input[i]);
        }
        if(isZero)
        {
            return "0";
        }
        return sb.toString(); 
    }    
        
class NumComparator implements Comparator<String>
{
    /*
    public int compare(String input1, String input2)
    {
    
        int max = input1.length() > input2.length() ? input1.length() : input2.length();
        int num1;
        int num2;
        
        int i = 0;
        int j = 0;
        while(i < max || j < max)
        {

            if(i >= input1.length())
            {
                num1 = Integer.parseInt(String.valueOf(input1.charAt(input1.length() - 1)));
            }
            else
            {
                num1 = Integer.parseInt(String.valueOf(input1.charAt(i)));

            }
            if(j >= input2.length())
            {
                num2 = Integer.parseInt(String.valueOf(input2.charAt(input2.length() - 1)));
            }
            else
            {
                num2 = Integer.parseInt(String.valueOf(input2.charAt(j)));
            }
            if(num2 != num1)
            return num2 - num1; 
            i++;
            j++;
        }
        
        return 0;} */
        
    public int compare(String input1, String input2)
    {
        long ans1 = Long.parseLong(input1 + input2);
        
        long ans2 = Long.parseLong(input2 + input1);
        
        if(ans1 > ans2)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
}
    
