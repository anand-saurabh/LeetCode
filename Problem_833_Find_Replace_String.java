//833. Find And Replace in String

// concept: String Modification
class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        
        int len = indexes.length;
        int stringLen = S.length();
        int pos;
        int replaceVal = 0;
        String temp = "";
        for (int i = 0; i < len; i++)
        {
            if(S.startsWith(sources[i], indexes[i]))
            {
                temp = S.substring(0, indexes[i]) + targets[i];
                if(indexes[i] + sources[i].length() < stringLen)
                temp = temp + S.substring(indexes[i] + sources[i].length());

                replaceVal =  targets[i].length() - sources[i].length();
                for (int j = i + 1; j < len; j++)
                {
                    if(indexes[j] >= indexes[i])
                    indexes[j] += replaceVal;
                }
                S = temp;
                stringLen = S.length();
            }
        }
        return S;
    }
}