package com.demo.tuf.bst;

public class constructBSTPreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        int arr[] = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };
        int n = arr.length;
 
        // same as levelorder
 
        System.out.print("PreOrder Traversal: ");
	}
	
	
}
