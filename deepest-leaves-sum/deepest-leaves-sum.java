/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode>
            q = new LinkedList();
        int count = 1;
        q.add(root);
        int tempCount = 0;
        int cur = 0;
        TreeNode temp;
        while(!q.isEmpty())
        {
​
            cur = 0;
            tempCount = 0;
            while(count > 0)
            {
                temp = q.poll();
                cur += temp.val;
                if(temp.left != null)
                {
                    q.offer(temp.left);
                    tempCount++;
                }
                if(temp.right != null)
                {
                    q.offer(temp.right);
                    tempCount++;
                }
                count--;
            }
            count = tempCount;
            if(tempCount == 0)
            {
                return cur;
            }
            
