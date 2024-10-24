package com.demo.tuf.binaryTree;

public class checkMirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Is Tree balanced? : "+mirrorTree(root.left,root.right));
	}
	
	public static boolean mirrorTree(TreeNode a,TreeNode b)
	{
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		
		if(a.val==b.val && mirrorTree(a.left,b.right) && mirrorTree(a.right,b.left))
			return true;
		return false;
	}

}
