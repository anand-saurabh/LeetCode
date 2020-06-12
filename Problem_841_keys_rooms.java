
//Problem : 841. Keys and Rooms
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int len = rooms.size();
        
        
        Queue<Integer>
            q = new LinkedList();
        
        Set<Integer>
            set = new HashSet();
        
        int count = rooms.get(0).size();
        int temp = 0;
        
        q.addAll(rooms.get(0));
        
        set.add(0);
        int key;
        while(!q.isEmpty())
        {
            temp = 0;
            while(count != 0)
            {
                key = q.poll();
                count--;
                if(set.contains(key))
                {
                    continue;
                }
                else
                {
                    set.add(key);
                    q.addAll(rooms.get(key));
                    temp += rooms.get(key).size();
                }
            }
            count = temp; 
        }
        int size = rooms.size();
        for (int i = 0; i < size; i++)
        {
            if(!set.contains(i))
            {
                return false;
            }
        }
        return true;
    }
}