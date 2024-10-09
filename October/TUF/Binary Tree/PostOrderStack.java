/*
 * Post Order traversal using recursion
 */

 class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x)
    {
        this.val = x;
        this.left = this.right = null;
    }

 void postOrder(TreeNode node)
 {
    if(node==null)
        return ;

    postOrder(node.right);
    postOrder(node.left);
    list.add(node.val);
 }


 //-----------------------------

 // using 2 stacks

 void postOrderStack(TreeNode node)
 {
    if(node == null)
        return;
    
    Stack<TreeNode> st1 = new Stack();
    Stack<TreeNode> st2 = new Stack();

    st1.push(node);

    while(!st1.isEmpty())
    {
        TreeNode temp = st1.peek();
        st1.pop();

        st2,push(temp);
        if(temp.left)
    }
 }
 