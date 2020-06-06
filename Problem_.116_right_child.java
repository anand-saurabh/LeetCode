//Problem : 116. Populating Next Right Pointers in Each Node
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Queue<Node>
            queue = new LinkedList<Node>();
        int count = 1;
        if(root == null)
        {
            return root;
        }
        Node tem;
        int temp;
        queue.offer(root);
        root.next = null;
        Node prev = null;
        while(count != 0)
        {
            
            temp = 0;
            while(count != 0)
            {
                tem = queue.poll();
                if(tem.left != null)
                {
                    if(prev != null)
                    prev.right.next = tem.left; 
                    queue.offer(tem.left);
                    temp++;
                }
                if(tem.right != null)
                {
                    queue.offer(tem.right);
                    tem.left.next = tem.right;
                    temp++;
                }
                prev = tem;
                count--;
            }
            prev = null;
            count = temp;
        }
        return root;
    }
}