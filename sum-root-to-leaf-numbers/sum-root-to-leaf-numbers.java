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
        StringBuffer temp = new StringBuffer(sb);
        temp.append(node.val);
        sb.append(node.val);
        if(node.left == null && node.right == null)
        {
            sum += Integer.parseInt((temp.toString()));
        }
        traverse(node.left, temp);
        traverse(node.right, sb);
    }
}
