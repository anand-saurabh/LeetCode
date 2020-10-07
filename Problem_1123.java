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
    TreeNode lca;
    Map<Integer, List<TreeNode>>
        map = new HashMap();
    
    int max = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        findDeepest(root, 0);
        List<TreeNode>
            nodes = map.get(max);
        if(nodes.size() == 1)
        {
            return nodes.get(0);
        }
        TreeNode temp = nodes.get(0);
        for (int i = 1; i < nodes.size(); i++)
        {
            findLCA(root, temp, nodes.get(i));
            temp = lca;
            lca = null;
        }
        return temp;
    }
    
    void findDeepest(TreeNode node, int level)
    {
        if(node == null)
        {
            return;
            
        }
        if(node.left == null && node.right == null)
        {
            if(level >= max)
            {
                max = level;
                List<TreeNode>
                     temp = map.getOrDefault(level, new ArrayList());
                temp.add(node);
                map.put(level, temp);
            }
            
        }
        findDeepest(node.left, level + 1);
        findDeepest(node.right, level + 1); 
    }
    
     boolean findLCA(TreeNode node, TreeNode a, TreeNode b)
    {
        if(node == null)
        {
            return false;
        }
        boolean toReturn = false;
        if(node.val == a.val || node.val == b.val)
        {
            if(lca == null)   
            {
                lca = node;
            }
            toReturn = true;
        }
        
        boolean left = findLCA(node.left, a, b);
        boolean right = findLCA(node.right, a, b);
                 System.out.print(node.val);

        //System.out.println("lcas val" + left + " " + right);
        
        if(left && right)
        {
            lca = node;
            return true;
        }
        if(toReturn && left || toReturn && right)
        {
            lca = node;
            return true;
        }
        return toReturn || left || right;
    }
    
    
}