//347. Top K Frequent Elements


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer>
            hashMap = new HashMap();
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            count = hashMap.getOrDefault(nums[i], 0);
            hashMap.put(nums[i], count+1);
        }
        PriorityQueue<Integer>
            queue = new PriorityQueue((n1,n2) -> hashMap.get(n2) - hashMap.get(n1));
        Set<Integer>
            keys = hashMap.keySet();
        for (int ele : keys)
        {
                queue.offer(ele);
        }
        int[] ans = new int[k];
        int i = 0;
        while(k != 0)
        {
            ans[i++] = queue.poll(); 
            k--;
        }
        return ans;
            
    }
}