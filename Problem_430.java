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
        Node cur = head;
      
        connect(head);
        return head;
    }
    
    void connect(Node node)
    {
        if(node == null)
        {
            return;
        }
        if(node.child != null)
        {
            Node next = node.next;
            node.next = node.child;
            node.child.prev = node;
            connect(node.child);
            node.child = null;
            prev.next = next;
            if(next != null)
            {
            next.prev = prev;
            connect(next); 
            }
        }
        else
        {
            prev = node;
            connect(node.next);
            
        }   
    }
}