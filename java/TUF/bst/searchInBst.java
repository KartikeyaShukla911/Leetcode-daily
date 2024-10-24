public static Node searchTree(Node root,int val)
{
    if(root==null || root.key==val)
        return root;

    if(root.val>val)
        searchTree(root.left,val);

    else
        searchTree(root.right,val);
}