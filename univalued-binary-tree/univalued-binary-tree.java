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
    int val;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        val = root.val;
        return isUniq(root);
    }
    
    public boolean isUniq(TreeNode node)
    {
        if(node == null)
            return true;
        if(node.val != val)
        {
            return false;
        }
        return isUniq(node.left) && isUniq(node.right);
    }
    
}
