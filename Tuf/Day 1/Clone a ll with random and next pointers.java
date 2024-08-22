// clone a linked list with random and next pointes

class LL
{
    int val;
    LL next;
    LL random;

    public LL(int val)
    {
        this.val = val;
        this.next=this.random = null;
    }
}

public static LL cloneCopy(LL head)
{
    if(head==null)
        return head;
    
    //1) inerting nodes in between existing nodes;
    //2) insert and add the random nodes to the new nodes;
    //3) breaking the new nodes and forming the new list;

    insertNodeInBetween(head);
    insertRandomNodes(head);
    LL newCopy = formNewList(head);
    return newCopy;
}

public static LL insertNodeInBetween(LL head)
{
    LL temp = head;
    while(temp!=null)
    {
        Node newNode = LL(temp.val);
        Node nextNode = temp.next;
        temp.nextNode = newNode;
        newNode.next = nextNode;
        temp = nextNode;
    }
}

public static void insertRandomNodes(LL head)
{
    LL temp = head;
    while(temp!=null)
    {
        Node newNode = temp.next;
        Node randomNode = temp.random;
        Node newRandomNode = new LL(randomNode.val);
        newrandomNode.next= randomNode.next;
        randomNode = newRandomNode.random;
        newNode.random = newrandomNode;
        temp=temp.next.next;
    }

}

public static LL formNewList(LL head)
{
    LL temp = head;
    while(temp!=null)
    {
        
    }
}