//Problem: 653. Two Sum. Input - BST

// DFS solution
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
    public boolean findTarget(TreeNode root, int k) {
        
        Set<Integer>
            sum = new HashSet();
        return findIfExist(root, k, sum);
    }
    
    boolean findIfExist(TreeNode node, int k, Set<Integer> sumSet)
    {
        if(node == null)
            return false;
        if(sumSet.contains(k - node.val))
        {
            return true;
        }
        else
        {
            sumSet.add(node.val);
        }
         
        return findIfExist(node.left,k,sumSet) || findIfExist(node.right, k, sumSet);   
        
    }
    
    
}