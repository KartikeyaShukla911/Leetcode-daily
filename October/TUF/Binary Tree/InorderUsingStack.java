//inorder traversal using Recursion


public static void inorder(TreeNode node)
{
    if(node==null)
        return;
    
    inorder(node.left);
    list.add(node.val);
    inorder(node.right);
}

//using stack

void inorderStack(TreeNode root)
{
    if(root==null)
    {
        return ;
    }

    Stack<TreeNode> st = new Stack();
    Node temp = root;
    
    while(temp!=null || st.size()>0)
    {
        
        while(temp.left!=null)
        {
            st.push(temp.left);
        }

       
        st.pop();
        temp=temp.right;
    }
    return list;
}