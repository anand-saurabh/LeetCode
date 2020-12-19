class Solution {
    public int findKthPositive(int[] arr, int k) {
        

        int count = 0;
        int index = 0;
        
        int prev = 0;
        
        while(count != k && index < arr.length)
        {
            
            if(arr[index] - prev != 1)
            {
                while((arr[index] - prev) != 1)
                {
                    prev = prev + 1;
                    count++;
                    if(count == k)
                    {
                        return prev;
                    }
                    
                }
                prev = arr[index];
                index++;
            }
            else
            {
                prev = arr[index];
                index++;
            }
        }
        
        if(count != k)
        {
            
            while(count != k)
            {
                prev += 1;
                count++;
            }
        }
        return prev;
    }
}