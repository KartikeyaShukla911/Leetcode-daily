// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.


// approach 1, O(n) S(n)

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int x = lengthFind(headA);
    int y = lengthFind(headB);

    while(x>y)
    {
        headA=headA.next;
        x--;
    }
    while(y>x)
    {
        headB=headB.next;
        y--;
    }

    while(headA!=null && headB != null)
    {
        if(headA ==headB)
            return headA;
        headA=headA.next;
        headB=headB.next;
    }
    return null;
}
public int lengthFind(ListNode temp)
{
    int cnt=0;
    while(temp!=null)
    {
        temp=temp.next;
        cnt++;
    }
    return cnt;
}


// approach 2

// using HashSet, O(N), Space = O(N)

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    HashSet<ListNode> hs = new HashSet();

    while(headA!=null)
    {
        hs.add(headA);
        headA=headA.next;
    }

    while(headB!=null)
    {
        if(hs.contains(headB))
            return headB;
        headB = headB.next;
    }

    return null;
}