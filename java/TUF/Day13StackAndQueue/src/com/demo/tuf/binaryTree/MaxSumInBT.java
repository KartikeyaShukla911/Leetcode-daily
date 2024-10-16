package com.demo.tuf.binaryTree;

public class MaxSumInBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        int maxDia[] = new int[1];
        maxDia[0]=Integer.MIN_VALUE;
        maxDia[0]=maxSum(root,maxDia);
        System.out.println("MaxSum in BinaryTree: "+maxDia[0]);
	}

	public static int  maxSum(TreeNode root,int maxDia[])
	{
		if(root==null)
			return 0;
		
		
		int lh = Math.max(0,height(root.left,maxDia));
		int rh = Math.max(0,height(root.right,maxDia));
		
		maxDia[0]= Math.max(maxDia[0], lh+rh+root.val);
		
		return Math.max(lh, rh) + root.val;
	}
	
	public static int height(TreeNode root,int maxDia[])
	{
		if(root==null)
			return 0;
		
		return root.val+Math.max(height(root.left,maxDia), height(root.right,maxDia));
	}
}
