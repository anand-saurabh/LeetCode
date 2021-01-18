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
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }
    
    boolean valid(TreeNode node, TreeNode max , TreeNode min)
    {
        if(node == null)
        {
            return true;
        }
        
        if(max != null)
        {
            if(node.val >= max.val)
            {
                return false;
            }
        }
        if(min != null)
        {
            if(node.val <= min.val)
            {
                return false;
            }
        }
        return valid(node.left, node, min) && valid(node.right, max, node);
        
    }
    
    
}