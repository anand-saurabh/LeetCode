/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode head;
    TreeNode cur;
//     public void flatten(TreeNode root) {
//         Stack<TreeNode>
//             s = new Stack();
        
//         s.push(root);
//         TreeNode prev = root;
//         TreeNode temp = root;
//             while(true)
//             {
//             while(temp != null)
//             {
//                 prev.right = temp;
                
//                 if(temp.left != null)
//                 s.push(temp.left);
//                 temp = temp.left;
//                 prev.left = null;
//             }
//                 if(!s.isEmpty())
//                 {
//                     temp = s.pop();
//                     if(temp.right != null)
//                     {
//                         s.push(temp.right);
//                         prev.left = null;
//                         prev.right = temp.right;
//                     }  
//                 }
//                 if(!s.isEmpty())
//                 temp = s.pop();
//                 else
//                 {
//                     break;
//                 }
//         }
//     }
    
        public void flatten(TreeNode root) {
            if(root  == null)
            {
                return;
            }
            
            TreeNode left = null;
            TreeNode right = null;
            if(head == null)
            {
                cur = root;
                head = root;
                left = root.left;
                right = root.right;
                root.left = null;
            }
            else
            {
                left = root.left;
                right = root.right;
                
                cur.right = root;
                cur = cur.right;
                cur.left = null;
            }
            
            flatten(left);
            flatten(right);
        }
    
}