public ListNode doubleIt(ListNode head) {
    Stack<ListNode> st = new Stack();

    while(head!=null)
    {
        st.push(head);
        head=head.next;
    }
    int carry=0;
    //head = null;
    while(!st.isEmpty())
    {
        int temp = st.peek().val;
        st.pop();
        temp = temp * 2;
        if(carry!=0)
        {
            temp +=1;
            carry=0;
        }
        if(temp>=10)
        {
            carry=1;
            temp = temp%10;
        }
        else
        {
            carry = 0;
        }
        
        if(head==null)
        {
            head = new ListNode(temp);
        }else{
        ListNode src = new ListNode(temp);
        src.next = head;
        head = src;
        }
    }
    if(carry!=0){ 
        if(head==null)
        {
            head = new ListNode(1);
        }else{
        ListNode src = new ListNode(1);
        src.next = head;
        head = src;
        }
    }
    return head;
}
