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
    int pos1 = -1;
    int pos2 = -2;
    TreeNode parent1;
    TreeNode parent2;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        
    checkCousins(root, x, y, 0, null);
    if(pos1 == pos2 && parent1 != parent2)
        return true;
    else
        return false;
        
    }
    
    public void checkCousins(TreeNode node, int x, int y, int level, TreeNode parent)
    {
        if(node == null)
        {
            return;
        }
        if(node.val == x)
        {
            pos1 = level;
            parent1 = parent;
        }
        else if(node.val == y)
        {
            pos2 = level;
            parent2 = parent;
        }
        checkCousins(node.left, x, y, level + 1, node);
        checkCousins(node.right, x, y, level + 1, node);
    }
}
