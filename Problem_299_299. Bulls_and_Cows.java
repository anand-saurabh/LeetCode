//299. Bulls and Cows
class Solution {
    public String getHint(String secret, String guess) {
        
        String s = new String();
        int bull = 0;
        int cows = 0;
        int count = 0;
        
        Map<Character, Integer>
            secMap = new HashMap();
        
Map<Character, Integer>
    guessMap = new HashMap();
        
        int len = secret.length();
        for (int i = 0; i < len; i++)
        {
            if(secret.charAt(i) == guess.charAt(i))
            {
                ++bull;
            }
            else
            {

                if(secMap.containsKey(guess.charAt(i)))
                {
                    count = secMap.get(guess.charAt(i));
                    count -= 1;
                    if(count == 0)
                    secMap.remove(guess.charAt(i));
                    else
                        secMap.put(guess.charAt(i), count);
                        
                    cows++;
                }
                else
                {
                       guessMap.put(guess.charAt(i), guessMap.getOrDefault(guess.charAt(i), 0) + 1);
                }
                if(guessMap.containsKey(secret.charAt(i)))
                   {
                    count = guessMap.get(secret.charAt(i));
                    count -= 1;
                    if(count == 0)
                    guessMap.remove(secret.charAt(i));
                    else
                        guessMap.put(secret.charAt(i), count);
                    cows++;
                   }
                   else
                   {
                       secMap.put(secret.charAt(i), secMap.getOrDefault(secret.charAt(i), 0) + 1);
 
                   }
            }
        }
        s = s.concat(String.valueOf(bull) + "A" + String.valueOf(cows) + "B");        
        return s;
    }
}