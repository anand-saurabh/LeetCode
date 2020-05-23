//Problem : 260. Single Number III

class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer>
            num = new HashSet();
        int i = 0;
        for (; i < nums.length; i++)
        {
            if(num.contains(nums[i]))
                num.remove(nums[i]);
            else
                num.add(nums[i]);
        }
        int []res = new int[num.size()];
        i = 0;
        for (int temp : num)
        {
            res[i++] = temp;
        }
        return res;
    }
}