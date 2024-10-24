package com.demo.tuf.binaryTree;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Is Tree balanced? : "+balancedBinaryTree(root));
	}

	public static boolean balancedBinaryTree(TreeNode root)
	{
		if(root==null)
			return true;
		
		int leftNode = height(root.left);
		int rightNode = height(root.right);
		
		if(Math.abs(leftNode-rightNode)<=1 && balancedBinaryTree(root.left) && balancedBinaryTree(root.right))
			return true;
		return false;
	}
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		return 1+ Math.max(height(root.left), height(root.right));
	}
}
