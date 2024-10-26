package com.demo.tuf.bst;

public class KthSmallest {
	static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Kth Smallest: "+kthSmallest(root,3));
	}

	public static TreeNode kthSmallest(TreeNode root, int key)
	{
		//performing inorder traversal
		
		if(root==null)
			return null;
		
		TreeNode temp = kthSmallest(root.left,key);
		
		if(temp!=null)
		{
			return temp;
		}
		cnt++;
		
		if(cnt==key)
		{
			return temp;
		}
		
		
		return kthSmallest(root.right,key);
		
	}
}
