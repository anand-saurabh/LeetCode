//Problem:112. Path Sum
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
    public boolean hasPathSum(TreeNode root, int sum) {
        return findIfPossible(root, sum, 0);
    }
    
    boolean findIfPossible(TreeNode node, int req, int cur)
    {
        if(node == null)
        {
            return false;
        }
        
        cur += node.val;
        if(req == cur && node.left == null && node.right == null)
        {
            return true;
        }
        return findIfPossible(node.left, req, cur) || findIfPossible(node.right, req, cur);
    }
}