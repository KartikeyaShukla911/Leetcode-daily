package com.demo.tuf.binaryTree;

public class SymmetryBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        System.out.println("Is tree symmetric: "+checkSymmetry(root));
	}

	public static boolean checkSymmetry(TreeNode root)
	{
		if(root==null)
			return true;
		return checkSymmetryUtil(root.left,root.right);
	}
	
	public static boolean checkSymmetryUtil(TreeNode a,TreeNode b)
	{
		if(a==null && b==null)
			return true;
		
		if(a.val==b.val && checkSymmetryUtil(a.left, b.right) && checkSymmetryUtil(a.right,b.left))
			return true;
		return false;
	}
}
