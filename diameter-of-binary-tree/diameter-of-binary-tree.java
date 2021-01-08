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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        findDia(root);
        return max-1;
    }
    
    int findDia(TreeNode node)
    {
        if(node == null)
            return 0;
        int left = 1 + findDia(node.left);
        int right = 1 + findDia(node.right);
        int m = left + right - 1;
​
        if(m > max)
        {
            max = m;
        }
        return left > right ? left : right;
        
    }
}
