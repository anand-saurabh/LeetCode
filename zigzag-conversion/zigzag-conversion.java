class Solution {
    public String convert(String s, int numRows) {
​
        if (numRows == 1) return s;
​
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());
​
        int curRow = 0;
        boolean goingDown = false;
​
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
​
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
​
​
// class Solution {
//     public String convert(String s, int numRows) {
//         char [][] out = new char[numRows][1000];
//         int row = numRows;
        
//         int i = 0;
//         int index = 0;
        
//         int col = 0;
//         int len = s.length();
        
//         while(index < len)
//         {
//             i = 0;
//         while(i < numRows && index < len)
//         {
//             out[i++][col] = s.charAt(index++);
//             System.out.print(" " + out[i-1][col]);
//         }
​
