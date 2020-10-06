/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)
        {
            return root;
        }
        Queue<Node>
            queue = new LinkedList();
        queue.add(root);
        
        int count = 1;
        int temp = 0;
        Node prev = null;
        while(!queue.isEmpty())
        {
            
            while(count != 0)
            {
                Node node = queue.poll();
                if(node.left != null)
                {
                    queue.add(node.left);
                    temp++;
                    if(prev != null)
                    {
                        prev.next = node.left;
                    }
                    prev = node.left;
                    
                }
                
                if(node.right != null)
                {
                    if(prev != null)
                    {
                        prev.next = node.right;
                    }
                    queue.add(node.right);
                    temp++;
                    prev = node.right;
                    
                }
                count--;
            }
            count = temp;
            temp = 0;
            prev = null;
        }
        return root;
    }
}