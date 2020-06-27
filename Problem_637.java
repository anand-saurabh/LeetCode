//Probelm: 637. Average of Levels in Binary Tree
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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>
            q = new LinkedList<TreeNode>();
        
        List<Double>
            ans = new ArrayList();
        int count = 0;
        if(root == null)
        {
            return ans;
        }
        count = 1;
        int tempo = 0;
        double sum = 0;
        TreeNode temp;
        double avg = 0;
        q.offer(root);
        while(!q.isEmpty())
        {
            sum = 0;
            avg = count;
            
            while(count != 0)
            {
                temp = q.poll();
                count--;
                sum += temp.val;
                if(temp.left != null)
                {
                    q.offer(temp.left);
                    tempo++;
                }
                if(temp.right != null)
                {
                    q.offer(temp.right);
                    tempo++;
                }
            }
            avg = sum/avg;
            ans.add(avg);
            count = tempo;
            tempo = 0;
        }
        return ans;
    }
}