class Solution {
    public String toGoatLatin(String S) {
        
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        String [] input = S.split(" ");
        StringBuffer answer = new StringBuffer();
        int k;
        for (int i = 0; i < input.length; i++)
        {
            String key = input[i];
            StringBuffer s = new StringBuffer();
            char first = key.charAt(0);
        
            if(vowels.contains(Character.toLowerCase(first)))
            {
                s = s.append(key);
            }
            else
            {
                s.append(key.substring(1));
                s.append(key.charAt(0));
            }
            s.append("ma");   
            k = i + 1;
            while(k > 0)
            {
                    s.append("a");
                    k--;
            }
            
            answer.append(s + " ");
        
        }
        return answer.toString().trim();
    }
}