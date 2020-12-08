/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    
    public Node copyRandomList(Node head) {
        
        Map<Node, Node>
            clone = new HashMap();
        
        Node cur = head;
        Node cloneHead = null;
        
        Node temp;
        Node tem;
        Node ran;
        while(cur != null)
        {
        if(clone.containsKey(cur))
        {
            temp = clone.get(cur); 
            
        }
        else 
        {
            temp = getNewNode(cur.val);
        }
            if(cloneHead == null)
            {
                cloneHead = temp;
            }
            clone.put(cur, temp);  
            if(cur.next != null)
            {
                if(clone.containsKey(cur.next))
                {
                    tem = clone.get(cur.next);
                }
                else
                {
                    tem = getNewNode(cur.next.val);
                    clone.put(cur.next, tem);  
                }
                temp.next = tem;
            }
             if(cur.random != null)
            {
                if(clone.containsKey(cur.random))
                {
                    ran = clone.get(cur.random);
                }
                else
                {
                    ran = getNewNode(cur.random.val);
                    clone.put(cur.random, ran);  
                }
                temp.random = ran;
            }
            cur = cur.next;
        }
        
        return cloneHead;

        
        
    }
    
    private Node getNewNode(int val)
    {
        Node n = new Node(val, null, null);
        return n;
    }
}