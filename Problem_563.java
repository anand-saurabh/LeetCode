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
    int ans = 0;
    public int findTilt(TreeNode root) {
        findTil(root);
        return ans;
    }
    
    int findTil(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        
        int left = node.val + findTil(node.left);
        int right = node.val + findTil(node.right);
        
        ans += Math.abs(left -right);
        return left + right - node.val;
    }
}