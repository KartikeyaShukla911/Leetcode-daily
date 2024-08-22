public static Node reverseKNode(Node head)
{
    if(head==null)
        return head;
    
    Node prevNode = null;
    Node temp = head;

    while(temp!=null)
    {
        Node KthNode = countKNode(temp,k);

        if(KthNode==null)
        {
            if(prevNode!=null)
                prevNode = temp;
            
            break;
        }

        Node currNextNode = KthNode.next;



        KthNode.next = null;

        KthNode = reverseList(temp);

        if(head==temp)
        {
            head = KthNode;

        }
        else
        {
            prevNode = KthNode;
        }

        prevNode =temp;
        temp = currNextNode;
    }
    return head;
}

public static Node reverseList(Node head)
{
    Node temp = head;

    Node prev = null;
    while(temp!=null)
    {
        Node front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
    }
    return prev;
}

public static Node countKNode(Node head, int k)
{
    Node temp = head;

    while(temp!=null && k-- >0)
    {
        temp=temp.next;
    }
    return temp;
}