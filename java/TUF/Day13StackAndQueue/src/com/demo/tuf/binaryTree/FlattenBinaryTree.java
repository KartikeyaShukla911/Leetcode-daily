package com.demo.tuf.binaryTree;

public class FlattenBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        flattenBT(root);
	}
	
	
	public static void flattenBT(TreeNode root)
	{
		if(root==null)
			return;
		
		TreeNode curr = root;
		
		while(curr!=null)
		{
			if(curr.left!=null)
			{
				TreeNode prev = curr.left;
				while(prev.right!=null)
				{
					prev=prev.right;
				}
				
				prev.right = curr.right;
				curr.right=curr.left;
				curr.left=null;
			}
			curr=curr.right;
		}
	}
}
