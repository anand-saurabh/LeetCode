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
    int ans = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        findKth(root, k);
        return ans;
        
    }
    
    void findKth(TreeNode node, int k)
    {
        if(node == null)
            return;
        findKth(node.left,k);
        count += 1;
        if(k == count)
        {
            ans = node.val;
            return;
        }
        findKth(node.right,k);
  
    }
}
