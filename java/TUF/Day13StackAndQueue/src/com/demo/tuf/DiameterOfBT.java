package com.demo.tuf;

public class DiameterOfBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Diameter: "+diameter(root));
	}

	public static int diameter(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		int dia = Math.max(dia,lh+rh);
		
		return 1+Math.max(lh, rh);
	}
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left),height(root.right));
	}
}
