//1299. Replace Elements with Greatest Element on Right Side
class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = arr[len-1];
        arr[len-1] = -1;
        int temp;
        for (int i = len - 2; i >= 0; i--)
        {
            temp = max;
            if(arr[i] > max)
            {
                max = arr[i];
            }
            arr[i] = temp;
        }
        return arr;
    }
}