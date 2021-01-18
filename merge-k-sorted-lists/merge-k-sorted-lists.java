​
 /* public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      
  } */
​
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<ListNode>
            filteredList = new ArrayList();
        
        for (int i = 0; i < lists.length; i++)
        {
            if(lists[i] != null)
                filteredList.add(lists[i]);
        }
        //5 6 7
        //1 2 3 4
        //4 8 9 10
        PriorityQueue<ListNode>
            minHeap = new PriorityQueue<ListNode>((n1,n2) -> n1.val - n2.val);
        
        int k = filteredList.size();
        
        minHeap.addAll(filteredList);
        
        ListNode prev = null;
        ListNode head = null;
        ListNode nextToAdd = null;
        while(!minHeap.isEmpty())
        {
            ListNode temp = minHeap.poll();
            if(temp.next != null)
            {
                nextToAdd = temp.next;
                minHeap.add(nextToAdd);
            }
            if(head == null)
            {
                head = temp;
                prev = head;
            }
            else
            {
                prev.next = temp;
                prev = temp;
            }
        }
        return head;
    }
            
        
        
        
}
