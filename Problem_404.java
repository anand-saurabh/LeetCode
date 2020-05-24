//Problem:404. Sum of Left Leaves

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
    
    Queue<TreeNode>
        queue = new LinkedList<TreeNode>();

    public int sumOfLeftLeaves(TreeNode root) {
        int count = 0;
        int sum = 0;
        TreeNode temp;
        if(root == null)
        {
            return 0;
        }
        queue.add(root);
        
        while(queue.size() > 0)
        {
            temp = queue.poll();
           
            if(temp.left != null)
            {
                queue.add(temp.left);
                if(temp.left.left == null && temp.left.right == null)
                {
                    sum += temp.left.val;
                }
            }
             if(temp.right != null)
            {
                queue.add(temp.right);
            }
        }
        return sum;
    }
}