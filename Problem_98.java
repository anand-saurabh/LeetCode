
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        return valid(root,null, null);
    }
    
    
boolean valid(TreeNode node, Integer low, Integer high)
    {
        if(node == null)
        {
            return true;
        }
        if(low != null)
        {
        if(node.val <= low)
        {
            return false;
        }
        }
        if(high != null)
        {
           if(node.val >= high)
        {
            return false;
        } 
            
        }
        return valid(node.left, low, node.val) && valid(node.right, node.val, high);
        
    }   
}