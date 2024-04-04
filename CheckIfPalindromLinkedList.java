public boolean isPalindrome(ListNode head) {
    if(head==null)
        return true;
    
    List<Integer> arr = new ArrayList();

    while(head!=null)
    {
        arr.add(head.val);
        head=head.next;
    }

    for(int i=0;i<arr.size();i++)
    {
        if(arr.get(i)!= arr.get(arr.size()-i-1))
            return false;
    }
    return true;
}