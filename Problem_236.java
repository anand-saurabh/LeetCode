/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    TreeNode lca;
  
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return root;
        }
        findLCA(root, p, q);
        return lca;
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
    
    
//     boolean findLCA(TreeNode node, TreeNode p, TreeNode q)
//     {
//           // Base case 
//         if(node == null)
//         {
//             return false;
//         }
        
//         if(node.val == p.val || node.val == q.val )
//         {
//             ans = node;
//             return true;
//         }
        
//         boolean left =  findLCA(node.left, p, q);
//         boolean right = findLCA(node.right, p, q);
        
//        if(left && right)
//        {
//            ans = node;
//            return true;
//        }
        
//        if(left == true)
//        {
//             return findLCA(node.left, p, q);
              
//        }
//         else
//         {
//             return findLCA(node.right, p, q); 
//         }
    
//     }
}