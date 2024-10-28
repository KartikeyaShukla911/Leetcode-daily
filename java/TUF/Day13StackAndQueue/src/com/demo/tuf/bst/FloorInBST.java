package com.demo.tuf.bst;

public class FloorInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Floor in BST: "+floorBst(root,3));
	}

	public static int floorBst(TreeNode root,int key)
	{
		if(root==null)
			return -1;
		
		if(root.val==key)
			return root.val;
		
		if(root.val>key)
		{
			return floorBst(root.left,key);
		}
		
		int floor = floorBst(root.right,key);
		
		return floor <=key && floor !=-1 ? floor : root.val;
	}
	
	// bfs is better, since it doesn't require overhead recursion call stack
}
