import java.util.*;

public class Solution {
    private int[] nums;
    private Random random;
    private int temp[];

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
        temp = Arrays.copyOf(nums, nums.length);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int i = random.nextInt(nums.length);
        int j = random.nextInt(nums.length);
        swap(temp, i , j);
        return temp;
    }
    
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
