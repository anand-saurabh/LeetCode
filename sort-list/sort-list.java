/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null)
        {
            return head;
        }
        Map<Integer, ListNode>
            map = new HashMap();
        
        List<ListNode>
            nodeList = new ArrayList<ListNode>();
        ListNode cur = head;
        while(cur != null)
        {
            map.put(cur.val, cur);
            nodeList.add(cur);
            cur = cur.next;
        }
        
        PriorityQueue<ListNode>
            queue = new PriorityQueue<ListNode>((n1,n2) -> n1.val - n2.val);
        queue.addAll(nodeList);
        ListNode head1 = null;
        ListNode prev = head;
        ListNode temp1;
        
        while(!queue.isEmpty())
        {
            temp1 = queue.poll();
            if(head1 == null)
            {
                head1 = temp1;
                prev = temp1;
            }
            else
            {
                prev.next = temp1;
                prev = temp1;
            }
        }
        prev.next = null;
        return head1;
    }
}