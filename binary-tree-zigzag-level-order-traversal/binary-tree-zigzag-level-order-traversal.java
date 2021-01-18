/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>
            sol = new ArrayList();
​
        if(root == null)
        {
            return sol;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int toDeq;
        TreeNode temp;
        List<Integer>
            ans;
        int count = 0;
        while(!queue.isEmpty())
        {
            ans = new ArrayList();
            toDeq = queue.size();
            while(toDeq > 0)
            {
                
                temp = queue.poll();
                
                ans.add(temp.val);
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
                toDeq--;   
            }
            count++;
            if(count % 2 != 0)
            {
                sol.add(ans);
            }
            else
            {
                Collections.reverse(ans);
                sol.add(ans);
            }
        }
        return sol;
    }
   
}
