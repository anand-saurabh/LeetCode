//Problem: 384. Shuffle an Array
class Solution {

    int nums[];
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len = nums.length;
        int[] rand = new int[nums.length];
        int pos;
        for (int i = 0; i < len; i++)
        {
            pos = (int)Math.random() * (i+1);
            rand[i] = rand[pos];
            rand[pos] = nums[i];
        }
        return rand;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */