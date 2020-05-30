//Problem:https://leetcode.com/problems/repeated-dna-sequences/

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Map<Character, Integer>
            charMap = new HashMap();
        charMap.put('A', 3);
        charMap.put('C', 5);
        charMap.put('G', 7);
        charMap.put('T', 11);
        
        Set<String>
            tempSet = new HashSet();
        int len = s.length();
        int count = 0;
        List<String>
            res = new ArrayList();

        Set<String>
            unique = new HashSet();
        int cur = 1;
        String temp;
        int i = 0;
        while(i < len)
        {
            ++count;
            cur *= charMap.get(s.charAt(i));
            if(count == 10)
            {
                    temp = s.substring(i-9, i - 9 + 10);
                    if(tempSet.contains(temp))
                    {
                        if(!unique.contains(temp))
                        {
                            res.add(temp);
                            unique.add(temp);
                        }
                        
                    }
                    else
                    tempSet.add(temp);
                cur = cur/charMap.get(s.charAt(i-9));
                count = 9;
            }
            ++i;
        }
        return res;
    }
}