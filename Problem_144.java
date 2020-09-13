/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode>
            stack = new Stack();
        
        List<Integer>
            ans = new ArrayList();
        
        TreeNode cur = root;
        while(cur != null)
        {
            if(cur.right != null)
            stack.push(cur.right);
            ans.add(cur.val);
            cur = cur.left;
            if(cur == null && !stack.isEmpty())
            {
                cur = stack.pop();
            }
        }
        return ans;
    }
}