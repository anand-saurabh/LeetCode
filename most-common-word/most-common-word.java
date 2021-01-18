class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> words = new HashMap();
        Set<String> bannedWords = new HashSet();
        int max = Integer.MIN_VALUE;
        String key;
        String answer = "";
        int temp;
        for (int i = 0; i < banned.length; i++)
        {
            bannedWords.add(banned[i]);
        }
​
        paragraph = paragraph.replaceAll("[!?',;.]", " ");
        String[] splittedWord = paragraph.split("\\s+");
​
        for (int i = 0; i < splittedWord.length; i++)
        {
            key = splittedWord[i].toLowerCase();
            if(!bannedWords.contains(key))
            {
                if(words.containsKey(key))
                {
                    temp = words.get(key);
                    temp = temp + 1;
                    words.put(key, temp);
                    
                }
                else
                {
                    words.put(key, 1);
                    temp = 1;
                } 
                if(temp > max)
                    {
                        answer = key;
                        max = temp;
                    }
            }
        }
        return answer;
    }
}
