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
                    temp++;
                    queue.add(tem.left);
                    if(prev != null)
                    {
                        prev.next = tem.left;
                    }
                    prev = tem.left;
                }
                if(tem.right != null)
                {
                    temp++;
                    queue.add(tem.right);
                    prev.next = tem.right;
                    prev = tem.right;
                }
                count--;
            }
            count = temp;
            prev = null;   
        }
        return root;
    }
}
