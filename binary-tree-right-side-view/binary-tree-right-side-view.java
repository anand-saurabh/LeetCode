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
    public List<Integer> rightSideView(TreeNode root) {
     
        List<Integer>
            sol = new ArrayList();
        if(root == null)
        {
            return sol;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode temp = null;
        while(!queue.isEmpty())
        {
            int toDeq = queue.size();
            
            while(toDeq > 0)
            {
            temp = queue.poll();
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
            sol.add(temp.val);
        }
        return sol;
