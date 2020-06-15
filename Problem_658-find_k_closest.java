//Problem:658. Find K Closest Elements
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer>
            ans = new ArrayList();
        if(arr.length == 1)
        {
            ans.add(arr[0]);
            return ans;
        }
        
        int count = 0;
        int len = arr.length;
        if(x < arr[0])
        {
            
            while(count != k)
            {
                ans.add(0,arr[count++]);
            }
        }
        else if (x > arr[len - 1])
        {
            count = len - k;
            while(count <= len - 1)
            {
                ans.add(0, arr[count++]);
            }
        }
        // 1 2 3 4 
        else
        {
            int i = 0;
            while(i < len && arr[i] <= x)
            {
                ++i;
            }
            
            int j = i - 1;
            if(i < len && arr[i] == x)
            {
                i = i + 1;
            }
            while(k != 0 && i < len && j >= 0)
            {
                int index = Math.abs(x - arr[j]) > Math.abs(x - arr[i]) ? i : j;
                if(index == i)
                {
                    ans.add(arr[i]);
                    i++;
                }
                else
                {
                    ans.add(arr[j]);
                    j--;
                }
                k--;
            }
            while(k != 0)
            {
                if(i != len)
                {
                    ans.add(arr[i++]);
                }
                else
                {
                    ans.add(arr[j--]);
                }
                k--;
            }
        }
       
        Collections.sort(ans); 
        return ans;
    }
}