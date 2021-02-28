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
    
    TreeNode LCA;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        findLCA(root, p, q);
        return LCA;
        
    }
    
    
    void findLCA(TreeNode node, TreeNode p, TreeNode q)
    {
        if(node == null)
        {
            return;
        }
        
        if(p.val < node.val && q.val > node.val || q.val < node.val && p.val > node.val)
        {
            LCA = node;
            return;
        }
        if(p.val < node.val && q.val < node.val)
        {
            findLCA(node.left, p, q);
        }
        else if(p.val > node.val && q.val > node.val)
        {
          
            findLCA(node.right, p, q);
        }
        
        if(node.val == p.val || node.val == q.val)
        {
            LCA = node;
            return;
        }
        
    }
}