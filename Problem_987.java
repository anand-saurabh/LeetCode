import java.util.*;
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
    
         Map<Integer, Integer>
            nodeLevelMap = new HashMap();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap();
        List<List<Integer>>
            verticalNodesList = new ArrayList();
        populateMap(root, map, 0, 0);
        for(Integer entry: map.keySet()) {
            PriorityQueue<Integer>
                temp = map.get(entry);
            List<Integer>
                t = new ArrayList();
            while(temp.size() != 0)
                
            {
             t.add(temp.poll());
            }
            verticalNodesList.add(t);
    }
        
        return verticalNodesList;
    }
    
    void populateMap(TreeNode node,  TreeMap<Integer, PriorityQueue<Integer>> map, int level, int cur)
    {
        if(node == null)
            return;
        
        nodeLevelMap.put(node.val, level);
        if(map.containsKey(cur))
        {
            map.get(cur).offer(node.val);
        }
        else
        {
            PriorityQueue<Integer> pq = new PriorityQueue
            ((n1,n2) -> (nodeLevelMap.get(n1) == nodeLevelMap.get(n2) ? (int)n1-(int)n2 : 
                                           nodeLevelMap.get(n1) - nodeLevelMap.get(n2)));
            pq.offer(node.val);
            map.put(cur, pq);
        }
        populateMap(node.left, map, level + 1, cur - 1);
        populateMap(node.right, map, level + 1, cur + 1);
    }
    
}