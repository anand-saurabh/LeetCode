/*
class TopVotedCandidate {

    Map<Integer, Integer>
        map = new HashMap();
    
    int maxVotes = 0;
    int count = 0;
    
    Map<Integer, Integer>
        winMap = new LinkedHashMap();
    
        
    public TopVotedCandidate(int[] persons, int[] times) {
        int len = persons.length;
        
        for (int i = 0; i < len; i++)
        {
            count = 1 + map.getOrDefault(persons[i], 0);
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
*/


class TopVotedCandidate {
    List<Vote> A;
    public TopVotedCandidate(int[] persons, int[] times) {
        A = new ArrayList();
        Map<Integer, Integer> count = new HashMap();
        int leader = -1;  // current leader
        int m = 0;  // current number of votes for leader

        for (int i = 0; i < persons.length; ++i) {
            int p = persons[i], t = times[i];
            int c = count.getOrDefault(p, 0) + 1;
            count.put(p, c);

            if (c >= m) {
                if (p != leader) {  // lead change
                    leader = p;
                    A.add(new Vote(leader, t));
                }

                if (c > m) m = c;
            }
        }
    }

    public int q(int t) {
        int lo = 1, hi = A.size();
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A.get(mi).time <= t)
                lo = mi + 1;
            else
                hi = mi;
        }

        return A.get(lo - 1).person;
    }
}

class Vote {
    int person, time;
    Vote(int p, int t) {
        person = p;
        time = t;
    }
}
/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */