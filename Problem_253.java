class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (n1,n2) -> n1[0] - n2[0]);
        
   PriorityQueue<Integer> pq =
        new PriorityQueue<Integer>(
            new Comparator<Integer>() {
              public int compare(Integer a, Integer b) {
                return a - b;
              }
            });
        for (int [] temp: intervals)
        {
            if(pq.size() == 0)
                
            {
                pq.offer(temp[1]);
            }
            else
            {
                if(pq.peek() <= temp[0])
                {
                    pq.poll();
                    pq.offer(temp[1]); 
                }
                else
                {
                    pq.offer(temp[1]);
                }
            }
            
        }
        return pq.size();
        
    }

}