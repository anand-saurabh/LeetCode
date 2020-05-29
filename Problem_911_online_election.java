//Problem: 911. Online Election

class TopVotedCandidate {

    Map<Integer, Integer>
        map = new HashMap();
    
    int maxVotes = 0;
    int count = 0;
    
    Map<Integer, Integer>
        winMap = new TreeMap();
    
        
    public TopVotedCandidate(int[] persons, int[] times) {
        int len = persons.length;
        
        for (int i = 0; i < len; i++)
        {
            count = map.getOrDefault(persons[i], 0);
            count += 1;
            if(count >= maxVotes)
            {
                maxVotes = count;
                winMap.put(times[i], persons[i]);
            }
            map.put(persons[i], count);
        }
    }
    
    public int q(int t) {
        
        Set<Integer>
            keys = winMap.keySet();
        int arr[] = new int[keys.size()];
        int i = 0;
        for (int key : keys)
        {
            arr[i++] = key;
        }
        
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int prev = 0;
        while(low <= high)
        {
            mid = (low + high) /2;
            if(arr[mid] == t)
            {
                prev = arr[mid];
                break;
            }
            else if (arr[mid] > t)
            {
                high = mid - 1;
            }
            else
            {
                prev = arr[mid];
                low = mid + 1;
            }
        }
        return winMap.get(prev);
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */