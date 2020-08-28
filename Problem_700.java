//700. Search in a Binary Search Tree
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
    TreeNode ans;
    public TreeNode searchBST(TreeNode root, int val) {
        findNode(root, val);
        return ans;
    }
    
    void findNode(TreeNode node, int val)
    {
        if(node == null)
        {
            return;
        }
        if(node.val == val)
        {
            ans = node;
            
        }
        if(node.val < val)
        {
            findNode(node.right, val);
        }
        else
        {
            findNode(node.left, val);
        }
    }
}