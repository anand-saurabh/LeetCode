class Solution {
    public int reverse(int x) {
        int i = 0;
        char temp;
        String input = String.valueOf(x);
        char [] inputCharSeq = input.toCharArray();
        int j = inputCharSeq.length - 1;
        
        if(inputCharSeq[0] == '-')
        {
            i += 1;
        }
        while(i < j)
        {
            
            temp = inputCharSeq[i];
            inputCharSeq[i] = inputCharSeq[j];
            inputCharSeq[j] = temp;
            i++;
            j--;
        }
        
        String toParse = new String(inputCharSeq);
        try {
            int answer = Integer.parseInt(toParse);
            return answer;
            
        }
        catch (Exception ex)
        {
            
            return 0;
            
        }
        
    }
}
