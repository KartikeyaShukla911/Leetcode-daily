//2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

//2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if(head==null || head.next==null || head.next.next==null)
            return new int[]{-1,-1};

        int i,mini=Integer.MAX_VALUE,maxi = Integer.MIN_VALUE;
        
        List<Integer> arr = new ArrayList();
        ListNode temp = head;
        int node_size = 1;
        ListNode prev = null;

        while(temp!=null)
        {
            
            if(node_size==1)
            {
                prev = temp;
            }
            else
            {
                if(temp.next==null)
                    break;
                ListNode curr = temp.next;
                if(temp.val > prev.val && temp.val > curr.val)
                {
                    
                    arr.add(node_size);
                }
                else if (temp.val < prev.val && temp.val <curr.val)
                {
                    arr.add(node_size);
                }
                System.out.println("Node size: "+node_size);
            }
            if(node_size!=1)
                prev=temp;
            node_size++;
            
            temp=temp.next;
        }

        int n = arr.size();

        if(n<2)
        {
            return new int[]{-1,-1};
        }

        //Collections.sort(arr);

        for(i=1;i<n;i++)
        {
            mini = Math.min(mini,arr.get(i)-arr.get(i-1));
        }

        maxi = arr.get(n-1) - arr.get(0);

        return new int[]{mini,maxi};
    }
}