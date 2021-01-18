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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>
            q = new LinkedList();
        int count = 1;
        TreeNode temp;
        List<List<Integer>> ans = new ArrayList();
        if(root == null)
        {
            return ans;
        }
        int counter = 0;
        List<Integer>
            tempList = new ArrayList();
        q.add(root);
        while(!q.isEmpty())
        {
            counter = 0;
            tempList = new ArrayList();
            while(count != 0)
            {
                temp = q.poll();
                tempList.add(temp.val);
                
                if(temp.left != null)
                {
                    q.add(temp.left);
                    counter++;
                }
                if(temp.right != null){
                    q.add(temp.right);
                    counter++;
                }
                count--;
            }
            ans.add(tempList);
            count = counter;
        }
     return ans;   
    }
}
