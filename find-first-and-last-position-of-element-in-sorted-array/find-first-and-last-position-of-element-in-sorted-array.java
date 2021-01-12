class Solution {
    int start = -1;
    int end = -1;
    
    public int[] searchRange(int[] nums, int target) {  
        int ans[] = {-1,-1};
        
        binarySearch(0, nums.length - 1, nums, target);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    
    void binarySearch(int low, int high, int [] input, int key)
    {
        if(low > high)
        {
            return;
        }
        int mid = (low + high)/2;
        
        if(input[mid] == key)
        {
​
            if(mid > 0)
            {
                
                if(input[mid-1] != key)
            {
                start = mid;
                //binarySearch(mid + 1, high, input, key);
                
            }
            else
            {
                binarySearch(low, mid - 1, input, key);
            }
            }
            else
            {
                start = mid;
            }
            
            if(mid < (input.length - 1))
            {
