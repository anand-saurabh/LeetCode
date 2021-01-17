class Solution {
     String [] unitDigit = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
                              "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
        String [] tens = {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if(num == 0)
            return "Zero";
        //2 3 1 1 9
        StringBuffer ans = new StringBuffer();
        ans.insert(0, common(num%1000));
        num = num/1000;
        if(num % 1000 != 0)
        ans.insert(0, common(num%1000) + "Thousand ");
        num = num/1000;
        if(num % 1000 != 0)
        ans.insert(0, common(num%1000) + "Million ");
        num = num/1000;
        if(num % 1000 != 0)
        ans.insert(0, common(num%1000) + "Billion ");
        return ans.toString().trim();
        
    }
    
    String common(int num)
    {
        StringBuffer ans = new StringBuffer();
        int temp = num;
        if(temp/100 != 0)
        ans.append(unitDigit[temp/100]).append("Hundred ");
        temp = temp% 100;
        if(temp/10 >= 2) {
        ans.append(tens[temp/10] + " ");
        temp = temp % 10;
        ans.append(unitDigit[temp]);
        }
        else
        {
            ans.append(unitDigit[temp]);
        }
        
        return ans.toString();
    }
}
