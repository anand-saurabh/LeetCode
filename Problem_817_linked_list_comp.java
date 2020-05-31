//Problem: 817. Linked List Components

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer>
            set = new HashSet();
        int count = 0;
        for (int i = 0; i < G.length; i++)
        {
            set.add(G[i]);
        }
        ListNode cur = head;
        boolean cont = false;
        int ans = 0;
        while(cur != null)
        {
  
            if(set.contains(cur.val))
            {
                if(!cont)
                {
                    cont = true;
                    ans += 1;
                }
            }
            else
            {
                cont = false;
            }
            cur = cur.next;     
        }
        return ans;
    }
}