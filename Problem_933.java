class RecentCounter {

    List<Integer>
        input;
    int low;
    int high;
    
    public RecentCounter() {
        input = new ArrayList();
    }
    
    public int ping(int t) {
        input.add(t);
        int temp = t - 3000;
        high = input.size() - 1;
        int mid;
        while(low <= high)
        {
            mid = (low + high)/2;
            if(input.get(mid) == temp)
            {
                return input.size() - mid;
            }
            else if (input.get(mid) > temp)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            } 
        }
        if(low > high)
        {
            return input.size() - low;
        }
        else return input.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */