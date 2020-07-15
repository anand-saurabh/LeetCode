//1261. Find Elements in a Contaminated Binary Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindElements {

    Set<Integer>
        value;
    public FindElements(TreeNode root) {
        this.value = new HashSet();
        this.recover(root, 0);
        
    }
    
    public boolean find(int target) {
        if(value.contains(target))
        {
            return true;
        }
        return false;
        
    }
    
    private void recover(TreeNode node, int val)
    {
        if(node == null)
        {
            return;
        }
        node.val = val;
        value.add(val);
        
        if(node.left != null)
        {
            recover(node.left, 2*node.val + 1);
            
        }
        
         if(node.right != null)
        {
            recover(node.right, 2*node.val + 2);
            
        }
    }
    
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */