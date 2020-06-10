//Problem 609. Find Duplicate File in System
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>>
            map = new HashMap();
        List<List<String>>
            toReturn = new ArrayList();
        String key;
        char c;
        int index = 0;
        String keys[];
        String content;
        for (int i = 0; i < paths.length; i++)
        {
            keys = paths[i].split("\\s+");

            for (int k = 1; k < keys.length; k++)
            {
                key = keys[k];
                index = key.indexOf("(");
                content = key.substring(index + 1, key.length() - 1);
                List<String>
                    toPut = map.getOrDefault(content, new ArrayList());
                toPut.add(keys[0] + "/" + key.substring(0, index));
                map.put(content, toPut);
            }
        }
        Set<String>
            keySet =  map.keySet();
        for (String mapKey : keySet)
        {
            if(map.get(mapKey).size() > 1)
                toReturn.add(map.get(mapKey));
        }
        return toReturn;
    }
}