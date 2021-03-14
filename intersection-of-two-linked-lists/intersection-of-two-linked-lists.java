/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int len1 = traverseList(headA);
        int len2 = traverseList(headB);
        
        if(len1 == 0 || len2 == 0)
        {
            return null;
        }
        
        if(len1 > len2)
        {
            while(len1 != len2)
            {
                headA = headA.next;
                len1--;
            }
        }
        else
        {
             while(len2 != len1)
            {
                headB = headB.next;
                len2--;
            }
            
        }
        
        while(headA != null && headB != null)
        {
            if(headA == headB)
            {
                return headA;
            }
            else
            {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
        
        
        
    public int traverseList(ListNode node)
    {
        if(node == null)
        {
            return 0;
        }
        int count = 0;
        ListNode temp = node;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        
        return count;
        
    }
}