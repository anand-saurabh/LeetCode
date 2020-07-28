public class Solution {
    int[] input;
    public Solution(int[] nums) {
        input = nums;
    }

    public int pick(int target) {
         int resevoir = -1;
         int cnt = 0;
         for(int i = 0; i < input.length; i++){
             if(input[i] == target){
                 cnt++;
                 Random rand = new Random();
                 int random = rand.nextInt(cnt);
                 
                 if(random == 0){
                     resevoir = i;
                 }
             }
         }
         
         return resevoir;
    }
}