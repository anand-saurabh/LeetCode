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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer>
            set = new LinkedHashSet();
        
        List<TreeNode>
            nodes = new ArrayList();
        //Arrays.sort(to_delete, Collection.reverseOrder());
        for (int i = 0; i < to_delete.length; i++)
        {
            set.add(to_delete[i]);
        }
        nodes.add(root);
        delete(root, nodes, set, null, false);
        return nodes;
    }
    
    
    void delete(TreeNode node, List<TreeNode>
            nodes, Set<Integer> set, TreeNode par, boolean left)
    {
        if(node == null)
        {
            return;
               
        }
        delete(node.left, nodes, set, node, true);
        delete(node.right, nodes, set, node, false);
        if(set.contains(node.val))
        {
            if(par != null)
            {
                if(left)
                {
                    par.left = null;
                }
                else
                {
                    par.right = null;
                }
            }
            else
            {
                nodes.remove(node);
            }
            if(node.left != null && node.right != null)
            {
                nodes.add(node.left);
                nodes.add(node.right);
            }
            else if(node.left != null)
            {
                nodes.add(node.left); 
            }
            else if (node.right != null)
            {
                nodes.add(node.right);
            }
        }
    }
}