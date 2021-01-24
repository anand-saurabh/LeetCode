/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
​
class Solution {
    Map<Integer, Integer>
        map = new HashMap();
    int maxLevel = -1;
    public int findBottomLeftValue(TreeNode root) {
        findLastLevelRow(root, 1);
        int answer = map.get(maxLevel);
        return answer;
    }
    
    void findLastLevelRow(TreeNode n, int i)
    {
        if(n == null)
        {
            return;
        }
        
        if(!map.containsKey(i))
        {
            if(i > maxLevel)
            {
                maxLevel = i;
            }
            map.put(i, n.val);
        }
        findLastLevelRow(n.left, i+1);
        findLastLevelRow(n.right, i+1);
    }
}
