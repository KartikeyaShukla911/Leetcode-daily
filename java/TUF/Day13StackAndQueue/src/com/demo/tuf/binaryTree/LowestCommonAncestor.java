package com.demo.tuf.binaryTree;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Lowest Common Ancestor in Tree: "+LCA(root,root.left.left,root.right).val);
	}

	public static TreeNode LCA(TreeNode root,TreeNode p,TreeNode q)
	{
		if(root==null || p==root || q==root)
		{
			return root;
		}
		
		TreeNode leftRoot = LCA(root.left,p,q);
		TreeNode rightRoot = LCA(root.right,p,q);
		
		if(leftRoot==null)
			return rightRoot;
		else if(rightRoot==null)
			return leftRoot;
		else
			return root;
	}
}
