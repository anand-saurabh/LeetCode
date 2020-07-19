/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>
            q = new LinkedList();
          List<Integer>
            ans = new ArrayList();
        if(root == null)
        {
            return ans;
        }
      
        q.add(root);
        int count = 1;
        TreeNode temp;
        int max = 0;
        int tempCount = 0;
        while(!q.isEmpty())
        {
            max = Integer.MIN_VALUE;
            
            while(count > 0)
            {
                temp = q.poll();
                if(temp.left != null)
                {
                    q.offer(temp.left);
                    tempCount++;
                }
                if(temp.right != null)
                {
                    q.offer(temp.right);
                    tempCount++;
                }
                if(temp.val > max)
                {
                    max = temp.val;
                }
                count--;
            }
            ans.add(max);
            count = tempCount;
            tempCount = 0;
        }
        return ans;   
    }
    
    
}