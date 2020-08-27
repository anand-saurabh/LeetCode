class Solution {
    public int findMinArrowShots(int[][] points) {
        
        int row = points.length;
        if(row == 0)
        {
            return 0;
        }
        LinkedList<Interval>
            list = new LinkedList();
        int ans = 0;
        for (int i = 0; i < row; i++)
        {
            Interval inter = new Interval(points[i][0], points[i][1]);
            list.add(inter);
        }
        int size = list.size();
        Interval temp;
        Interval temp1;

        Collections.sort(list, new IntervalComparator());
        
        while(list.size() > 1)
        {
            temp = list.removeFirst();
            temp1 = list.removeFirst();
            if(!(temp.end < temp1.start))
            {
                 temp.end = temp.end > temp1.end ? temp1.end : temp.end;
                list.addFirst(temp);
            }
            else
            {
                list.addFirst(temp1);
                ans += 1;
            }
        }
         return ans + 1;   
    }
}

class Interval
{
    int start;
    int end;
    
    public Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}

class IntervalComparator implements Comparator<Interval>
{

@Override
public int compare(Interval a, Interval b)
{

if(a.start == b. end)
{
return a.end - b.end;
}
else
{
return a.start - b.start;
}
}

}