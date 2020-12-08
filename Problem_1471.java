class Solution {
    int med;
    public int[] getStrongest(int[] arr, int k) {
        
        Arrays.sort(arr);
        med = arr[(arr.length - 1) / 2];
        Integer[] temp = new Integer[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
			temp[i] = Integer.valueOf(arr[i]);
		}

        Arrays.sort(temp, new StrongValues());
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
			ans[i] = temp[i];
		}
        return ans;
    }
    
    class StrongValues implements Comparator<Integer>
 {
     
     public int compare(Integer a, Integer b)
     {
         int diff = Math.abs(b-med) - Math.abs(a-med);
         if (diff == 0) {
             return b - a;
         }
      return diff;
     }   
 }

}
