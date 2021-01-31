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
    
    TreeNode head;
    TreeNode cur;
    
    public TreeNode increasingBST(TreeNode root) {
        
        head = new TreeNode(-1);
        cur = head;
        inorder(root);
        return head.right;
        
    }
    
    void inorder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left);
        cur.right = node;
        node.left = null;
        cur = node;
        inorder(node.right);
    }
}