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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
        {
            TreeNode node = new TreeNode();
            node.val = val;
            return node;
        }
        TreeNode cur = root;
        TreeNode prev = root;
                                                           
        while(cur != null)
        {
            if (cur.val > val)
            {
                prev = cur;
                cur = cur.left;
            }
            else
            {
                prev = cur;
                cur = cur.right;
            }
        }
        TreeNode node = new TreeNode();
        node.val = val;
        if(prev.val > val)
        {
            prev.left = node;
        }
        else
        {
            prev.right = node;
        }
        return root;
    }
    
    
}