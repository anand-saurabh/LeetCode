class Solution {
    String regex = "-*\\d+";
 
​
    public int calPoints(String[] ops) {
        List<Integer>
            nums = new ArrayList();
        int tot = 0;
        for (int i = 0; i < ops.length; i++)
        {
            if(ops[i].matches(regex))
            {
                nums.add(Integer.parseInt(ops[i]));
                tot = tot + Integer.parseInt(ops[i]);
                System.out.print("tot" + tot + " ");
            }
            else if(ops[i].equals("C"))
            {
                
                if(nums.size() > 0){
                    int eleToRemove = nums.get(nums.size() - 1);
                    nums.remove(nums.size() - 1);
                    tot = tot - eleToRemove;
                }
                                System.out.print("tot" + tot + " ");
​
                
                
            }
            else if(ops[i].equals("D"))
            {
                int ele = nums.get(nums.size() - 1);
                nums.add(2*ele);
                tot += 2*ele;
                                                System.out.print("tot" + tot + " ");
​
​
            }
            else if(ops[i].equals("+"))
            {
                int sum = 0;
                int size = nums.size();
                if (size >= 2){
                    int ele1 = nums.get(nums.size() - 1);
                    int ele2 = nums.get(nums.size() - 2);
