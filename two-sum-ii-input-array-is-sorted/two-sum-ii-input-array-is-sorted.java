class Solution { 
    public int[] twoSum(int[] numbers, int target) { 
    int front = 0; 
    int [] answer = new int[2];
        
    int back = numbers.length - 1; 
        
        int cur = numbers[front] + numbers[back]; 
        while(front < back) {
            if(cur == target)
            {
                answer[0] = front + 1;
                answer[1] = back + 1;
                return answer;
            }
            if(cur < target)
            {
                cur = numbers[++front] + numbers[back];
            }
            else
            {
                
                cur = numbers[front] + numbers[--back];
​
            }
        }
        return answer;
    }
    
}
