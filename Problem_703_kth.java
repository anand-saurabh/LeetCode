//Problem703. Kth Largest Element in a Stream

class KthLargest {

    PriorityQueue<Integer>
        que;
    int number;
    int tot = 0;
    List<Integer>
        num = new LinkedList();
    public KthLargest(int k, int[] nums) {
        que = new PriorityQueue<Integer>((n1,n2) -> n1 - n2);
        for (int n : nums)
        {
            que.add(n);
        }
        number = k;
        tot = que.size();
       
    }
    
    public int add(int val) {
        if(!num.isEmpty() && num.get(num.size() - 1) > val)
        {
            int i = 0;
            int low = 0;
            int high = num.size() - 1;
            int pos = 0;
            int mid;
            while(low <= high)
            {
                mid = (low + high)/2;
                if(num.get(mid) == val)
                {
                    pos = mid;
                    break;
                }
                else if(num.get(mid) > val)
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            num.add(pos, val);
        }
        else
        {
        que.offer(val);
        }
        tot++;
        int k = tot - number + 1;
        
        k = k - num.size();
        int count = 0;
        while(count < k)
        {
            num.add(que.poll());
            count++;
        }
         
        return num.get(num.size() - 1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */