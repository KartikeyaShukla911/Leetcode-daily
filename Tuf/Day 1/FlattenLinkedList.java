// flatten a linkedlist

class Node
{
    int val;
    Node next;
    Node child;

    public Node(int val)
    {
        this.val = val;
        next=null;
        curr = null;
    }
}

public static Node flattenList(Node head)
{
    if(head==null || head.next==null)
    {
        return head;

    }

    Node secondNode = flattenList(head.next);
    Node mergedNode = merge(head,secondNode);
    return mergedNode;
}

public static Node merge(Node list1,Node list2)
{
    Node dummy = new Node(-1);
    Node res = dummy;

    while(list1!=null && list2!=null)
    {
        if(list1.val<list2.val)
        {
            res.child = list1;
            res = list1;
            list1=list1.child;
        }
        else
        {
            res.child = list2;
            res = list2;
            list2 = list2.child;
        }
        res.next = null;
    }

    if(list1!=null)
    {
        res.child=list1;
        
    }

    else (list2!=null)
    {
        res.child=list2;
        
    }

    if(dummy.child!=null)
    {
        if(dummy.child.next!=null)
            dummy.child.next=null;
    }
    return dummy.child;
}