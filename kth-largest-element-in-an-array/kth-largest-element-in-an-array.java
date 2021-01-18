public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        int index = high - k + 1;
        while(low < high)
        {
            int partition = partition(nums, low, high);
            if(partition > index)
            {
                high = partition - 1;
            }
            else if(partition < index)
            {
                low = 1 + partition;
            }
            else return nums[partition];
        }
        return nums[low];
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = start, temp;
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) start++;
            while (start <= end && nums[end] > nums[pivot]) end--;
            if (start > end) break;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        temp = nums[end];
        nums[end] = nums[pivot];
        nums[pivot] = temp;
        return end;
    }
}
