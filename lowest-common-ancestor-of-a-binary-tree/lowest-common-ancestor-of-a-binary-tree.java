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
    
    TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        findLCA(root, p, q);
        return lca;
        
    }
    
    boolean findLCA(TreeNode node, TreeNode p, TreeNode q)
    {
        if(node == null)
        {
            return false;
        }
        
        boolean toReturn = false;
        
        if(node.val == p.val || node.val == q.val)
        {
            toReturn = true;
        }
        
        boolean left = findLCA(node.left, p, q);
        boolean right = findLCA(node.right, p, q);
        
        if((left && right) || (left && toReturn) || (right && toReturn))
        {
            if(lca == null)
            {
                lca = node;
            }
        }
        
        return toReturn || left || right;
    }
}
