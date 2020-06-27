//729. My Calendar I
class MyCalendar {

    TreeMap<Integer, Integer>
        timeMap;
    public MyCalendar() {
        timeMap = new TreeMap();
    }
    
    public boolean book(int start, int end) {
        Integer key1 = timeMap.floorKey(start);
        Integer key2 = timeMap.ceilingKey(start);
        if((key1 == null || timeMap.get(key1) <= start)
           && (key2 == null || key2 >= end))
        {
            timeMap.put(start, end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */