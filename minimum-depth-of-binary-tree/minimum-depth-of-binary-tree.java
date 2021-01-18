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
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        findMinDepth(root, 0);
        return min;
    }
    
    void findMinDepth(TreeNode node, int depth)
    {
        if(node == null)
        {
            return;
        }
        if(node.left == null && node.right == null)
        {
            if(min > (depth + 1))
                min = depth + 1;
        }
        findMinDepth(node.left, depth + 1);
        findMinDepth(node.right, depth + 1);
    }
}
