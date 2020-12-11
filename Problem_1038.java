//  Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    int val = 0;
    public TreeNode bstToGst(TreeNode root) {
        findGreater(root);
        return root;
    }
    
    void findGreater(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        
        findGreater(node.right);
        val += node.val;
        node.val = val;
        findGreater(node.left);
    }
}