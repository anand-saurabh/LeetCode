/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return max;
    }
    
    int findDia(TreeNode node){
        if(node == null)
        {
            return 0;
        }
        
        int left = 1 + findDia(node.left);
        int right = 1 + findDia(node.right);
        
        if((left + right - 2) > max)
        {
            max = left + right - 2;
        }
        
        return Math.max(left, right);
    }
    
}
