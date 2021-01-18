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
​
        
        
    }
    
    private Node getNewNode(int val)
    {
        Node n = new Node(val, null, null);
        return n;
    }
}
