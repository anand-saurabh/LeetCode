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
    TreeNode rootNode; 
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        rootNode = root;
        deleteLeaves(rootNode, limit, 0, null, false);
        return rootNode;
    }
    
    boolean deleteLeaves(TreeNode node, int limit, int cur, TreeNode parent, boolean leftChild)
    {
        if(node == null)
        {
            return false;
        }
        
        if(node.left == null && node.right == null)
        {
            if((cur + node.val) < limit)
            {
                if(leftChild)
            {
                if(parent != null)
                parent.left = null;
                else
                {
                    node = null;
                }
            }
            else
            {
                if(parent!= null)
                parent.right = null;
                else
                {
                    node = null;
                }
            }
                return false;
            }
            //System.out.println("cur" + cur + " " + node.val);
            return true;
        }
        
        boolean notDel1 = deleteLeaves(node.left, limit, cur + node.val, node, true);
        boolean  notDel2 = deleteLeaves(node.right, limit, cur + node.val, node, false);
        
        if(node.left == null && node.right == null && !(notDel1 || notDel2))
        {
            if(leftChild)
            {
                if(parent != null)
                parent.left = null;
                else
                {
                    rootNode = null;
                }
            }
            else
            {
                if(parent!= null)
                parent.right = null;
                else
                {
                    rootNode = null;
                }
            }
            return false;
        }
        return true;
    }
}