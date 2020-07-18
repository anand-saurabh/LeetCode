//1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original, cloned, target);
        return ans;
        
    }
    
    private void traverse(TreeNode t1, TreeNode t2, TreeNode target)
    {
        if(t1 == null)
        {
            return;
        }
        if(t1 == target)
        {
            ans = t2;
        }
        traverse(t1.left, t2.left, target);
        traverse(t1.right, t2.right, target);
    }
    
}