/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
​
    public int maxDepth(Node root) {
        Node [] nodeList = new Node[100000];
        int front = 0;
        int rear = - 1;
        Node temp = root;
        nodeList[++rear] = temp; 
        int count = 0;
    
        int itr = rear - 1;
        int childCount = 1;
        int level = 0;
        while(nodeList[++itr] != null)
        {
            temp = nodeList[itr];
            childCount--;
            
            
            count += temp.children.size();
            for (int i = 0; i < temp.children.size(); i++)
            {
                nodeList[++rear] = temp.children.get(i);
                
            }  
            if(childCount == 0){
            level++;
            childCount = count;
            count = 0;
            }
        }
