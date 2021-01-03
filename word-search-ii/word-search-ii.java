class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Map<Character, List<String>>
            map = new HashMap();
        List<String>
            ans = new ArrayList();
        
        for (int i  = 0; i < words.length; i++)
        {
            List<String>
                word = map.getOrDefault(words[i].charAt(0), new ArrayList());
            word.add(words[i]);
            map.put(words[i].charAt(0), word);
        }
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(map.containsKey(board[i][j]))
                {
                    List<String>
                        wordList = map.get(board[i][j]);
                    
                    for (int k = 0; k < wordList.size(); k++){
                    
                        if(findExist(board, i, j, row, col, 0, wordList.get(k)))
                        {
                            ans.add(wordList.get(k));
                            map.get(board[i][j]).remove(wordList.get(k));
                            k--;
                            if(map.get(board[i][j]).size() == 0)
                            {
                                map.remove(board[i][j]);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
    
    
    boolean findExist(char[][] board, int i, int j, int row, int col, int index, String word)
    {
        if(i < 0 || j < 0 || i >= row || j >= col || board[i][j] =='0')
        {
            return false;
        }
        if(board[i][j] == word.charAt(index))
        {
            if(index == word.length() - 1)
            {
                return true;
