/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<ListNode>
            stack = new Stack();
        ListNode cur = head;
        ListNode temp;
        int count = -1;
        Map<ListNode, Integer>
            map = new HashMap();
        
        Map<ListNode, Integer>
            indexMap = new HashMap();
        while(cur != null)
        {
            while(!stack.isEmpty() && stack.peek().val < cur.val)
            {
                temp = stack.pop();
                map.put(temp, cur.val);
            }
            count++;
            indexMap.put(cur, count); 
            stack.push(cur);
            cur = cur.next;
        }
        int [] ans = new int[count + 1];
        Set<ListNode>
            keys = map.keySet();
        for (ListNode key : keys)
        {
            ans[indexMap.get(key)] = map.get(key);
        }
        return ans;
    }
}