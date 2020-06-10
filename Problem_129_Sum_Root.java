//Problem 129. Sum Root to Leaf Numbers
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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        traverse(root, new StringBuffer());
        return sum;
        
    }
    
    void traverse(TreeNode node, StringBuffer sb)
    {
        if(node == null)
        {
            return;
        }
        sb.append(node.val);
        StringBuffer copy = new StringBuffer(sb);
        if(node.left == null && node.right == null)
        {
            sum += Integer.parseInt(sb.toString());
            return;
        }
        traverse(node.left, sb);
        traverse(node.right, copy);        
    }
}