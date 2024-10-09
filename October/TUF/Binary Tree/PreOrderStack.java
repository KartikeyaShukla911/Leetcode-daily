//Preorder using Recursion

void preOrder(TreeNode root)
{
    if(root==null)
        return ;

        list.add(root.val);
    preOrder(root.left);
    
    preOrder(root.right);
}


// using stack

void preOrderStack(TreeNode root)
{
    if(root==null)
        return ;
    
    Stack<Integer> st = new Stack();
    TreeNode temp = root;
    st.push(root);

    while(!st.isEmpty())
    {
        TreeNode temp = st.peek();
        st.pop();
       
        if(temp.right!=null)
            st.push(temp.right);
        
        if(temp.left!=null)
            st.push(temp.left);
       
    }
    return list;
}