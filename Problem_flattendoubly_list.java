/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    Node prev;
    
        public Node flatten(Node head) {
            flattenList(head);
            return head;
        }

    public void flattenList(Node head) {
        if(head == null)
        {
            return;
        }
        
        if(head.child != null)
        {
            Node temp = head.next;
            prev = head;
            flatten(head.child);
            if(head.next != null)
            {
                head.next.prev = prev;
            }
            prev.next = head.next;
            head.next = head.child;
            head.child.prev = head;
            head.child = null;
            flatten(temp);
        }
        else
        {
            prev= head;
            flatten(head.next);
        }
    }
}