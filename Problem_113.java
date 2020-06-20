//Problem 113. Path Sum II
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
    int max = 0;
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>
            ans = new ArrayList();
        findSum(root, sum, 0, new ArrayList(), ans);
        return ans;
        
    }
    
    void findSum(TreeNode node, int sum, int cur, List<Integer> curList, List<List<Integer>>
                ans)
    {
        if(node == null)
        {
            return;
        }
        cur += node.val;
        if(cur == sum && node.left == null && node.right == null)
        {
            ans.add(curList);
        }
        curList.add(node.val);
        List<Integer>
            temp = new ArrayList(curList);
        findSum(node.left, sum, cur, curList, ans);
        findSum(node.right, sum, cur, temp, ans);
    }
}