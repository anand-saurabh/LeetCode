class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i =0, j = 0;
        int m = nums1.length;
        int n = nums2.length;
        boolean isOdd = false;
        if(!((m + n) % 2 == 0))
        {
            isOdd = true;
        }
        
        
        int count = (m + n)/2;
        double key1 = 0,key2 = 0;
        
        
        while(count >= 0 && (i < nums1.length)
             && (j < nums2.length))
        {
            if(nums1[i] < nums2[j])
            {
            if(count == 0)
            {
                key1 = nums1[i];
            }
            else if (count == 1)
            {
                
                key2 = nums1[i];
            }
                i++;
            }
            else
            {
             if(count == 0)
            {
                key1 = nums2[j];
            }
            else if (count == 1)
            {
                
                key2 = nums2[j];
            }           
            
                j++;  
        }
            count--;
