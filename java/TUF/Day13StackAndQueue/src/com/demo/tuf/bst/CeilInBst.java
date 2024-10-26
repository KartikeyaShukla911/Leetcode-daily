package com.demo.tuf.bst;

public class CeilInBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Ceil in BST: "+findCeil(root,2));
	}
	
	public static int findCeil(TreeNode root, int key)
	{
		if(root==null)
			return -1;
		
		if(root.val==key)
			return root.val;
		
		if(root.val < key)
		{
			return findCeil(root.right,key);
		}
		
		int temp = findCeil(root.left,key);
		
		return (temp >=key)? temp : root.val;
	}

}
