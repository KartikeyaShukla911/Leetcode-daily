package com.demo.tuf.bst;

public class BSTtoDLL {

	public static TreeNode prev=null;
	public static TreeNode head=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("BST to doubly ll "+dllbst(root));
	}

	public static TreeNode dllbst(TreeNode root)
	{
		if(root==null)
		{
			return root;
		}
		
		TreeNode TreeLeft = dllbst(root.left);
		
		if(prev==null)
		{
			head=root;
		}
		else
		{
			root.left = prev;
			prev.right=root;
		}
		prev=root;
		
		return dllbst(root.right);
	}
}
