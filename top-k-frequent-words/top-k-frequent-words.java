class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer>
            map = new HashMap();
        List<String>
            ans = new LinkedList();
        
        for (int i = 0; i < words.length; i++)
        {
            if(map.containsKey(words[i]))
            {
                int count = map.get(words[i]);
                map.put(words[i], count+1);
            }
            else
            {
                map.put(words[i], 1);
            }
        }
        
        PriorityQueue<String>
            pq = new PriorityQueue<String>((n1,n2) -> ((map.get(n1) - map.get(n2) == 0) ?  n2.compareTo(n1) : (map.get(n1) - map.get(n2))));
        
        Set<String>
            wordList = map.keySet();
        for (String temp : wordList)
        {
            if(pq.size() == k && map.get(temp) < map.get(pq.peek()))
            {
                continue;
            }
            pq.offer(temp);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        
        
        while(!pq.isEmpty())
        {
            ans.add(0, pq.poll());
        }
        
        return ans;
        
    }
}
