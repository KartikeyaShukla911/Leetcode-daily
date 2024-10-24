public static boolean checkIfBst(TreeNode root)
{
    if(root==null)
        return true;

    if(root.left!=null && minValue(root.left) > root.val)
        return false;
    
    if(root.right!=null && maxValue(root.right) < root.val)
        return false;
    
        return true;
}

public static int maxValue(TreeNode root)
{
    if(root==null)
        return Math.min;
    
    return Math.max(root.val,Math.max(root.left,root.right));
}

public static int minValue(TreeNode root)
{
    if(root==null)
        return Math.max;
    
    return Math.min(root.val,Math.max(root.left,root.right));
}


//O^n2

----------------

//O^n

public static boolean checkBst(TreeNode root, int[] prev)
{
    if(root==null)
        return true;
    
        if(!validBst(root.left,prev))
            return false;

        if(prev[0] >=root.val)
                return false;

        prev[0]=root.val;

        return checkBst(root.right,prev);
} // O^n