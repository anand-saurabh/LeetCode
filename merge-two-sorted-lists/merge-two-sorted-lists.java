            else 
            {
                if(head == null)
                {
                    head = l2;
                    cur = l2;
                }
                 else
                {
                    cur.next = l2;
                    cur = cur.next;
                }
                l2 = l2.next;
            }
        }
        if(l1 != null)
        {
            if(head == null)
                {
                    head = l1;
                }
            else
            {
            cur.next = l1;
            }
        }
        else if(l2 != null)
        {
            if(head == null)
                {
                    head = l2;
                }
            else
            {
​
            cur.next = l2;
            }
        }
        
        return head;
    }
}
