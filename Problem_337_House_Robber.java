//Problem:337. House Robber III
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
    Map<TreeNode, Integer>
        map = new HashMap();
    public int rob(TreeNode root) {
        return maxMoney(root);
    }
    
    int maxMoney(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        if(map.containsKey(node))
        {
            return map.get(node);
        }
        int m =0,n =0,o =0,p =0 ,q =0 ,r = 0;
        if(node.left != null)
        {
        m = maxMoney(node.left.left);
        n = maxMoney(node.left.right);
        }
        
        if(node.right != null)
        {
            o = maxMoney(node.right.left);
            p = maxMoney(node.right.right);            
        }
        q = maxMoney(node.left);
        r = maxMoney(node.right);
        int val1 = m + n + o + p + node.val;
        int val2 = q + r;
        int max = val1 > val2 ? val1 : val2;
        map.put(node, max);
        return max;
    }
}