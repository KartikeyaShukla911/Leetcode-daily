package com.demo.tuf.bst;

public class kthLargestBst {

	public static int cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Kth Largest: "+kthLargest(root,3));
	}

	public static TreeNode kthLargest(TreeNode root, int k)
	{
		if(root==null)
			return root;
		
		kthLargest(root.right, k);
		
		cnt++;
		if(cnt==k)
		{
			return root;
		}
		
		return kthLargest(root.left, k);
	}
}
