class Solution {
    public String intToRoman(int num) {
        
        String one [] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String ten [] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundred[] = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousand [] = {"", "M", "MM", "MMM"};
        
        StringBuffer ans = new StringBuffer();
        ans.append(thousand[num/1000]);
        num = num%1000;
        ans.append(hundred[num/100]);
        num = num%100;
        ans.append(ten[num/10]);
        num = num % 10;
        ans.append(one[num]);
        
        return ans.toString();
    }
}
