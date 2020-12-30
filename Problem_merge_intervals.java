class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, new Compa());
        LinkedList<int[]> merged = new LinkedList<>();

        merged.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++)
        {
            if(!(merged.getLast()[1] < intervals[i][0]))
            {
                merged.getLast()[1] = Math.max(merged.getLast()[1], intervals[i][1]);
            }
            else
            {
                merged.add(intervals[i]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
    
    
    public class Compa implements Comparator<int[]>
    {
        
        public int compare(int [] a, int b[])
        {
            if(a[0] < b[0])
            {
                return -1;
            }
            else
            {
                if(a[0] == b[0])
                return a[1] - b[1];
                else
                    return 1;
            }
        }  
    }