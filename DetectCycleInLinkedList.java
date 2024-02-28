public boolean hasCycle(ListNode head) {
    if(head==null)
        return false;
    if(head.next==null)
        return false;
    
    // HashSet<ListNode> hs = new HashSet<>();
    // while(head!=null)
    // {
    //     if(hs.contains(head))
    //         return true;
    //     else
    //         hs.add(head);
    //     head=head.next;
    // }
    // return false;

    ListNode slow = head;
    ListNode fast = head.next;

    while(slow!=null && fast!=null && fast.next!=null)
    {
        if(slow==fast)
            return true;
        slow = slow.next;
        fast = fast.next.next;
    }
    return false;
}