package com.demo.tuf.bst;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val)
	{
		this.val = val;
		this.left=null;
		this.right = null;
		
	}
	
	
}

public class ConstructBST {
	
	public static TreeNode constructBst(int arr[],int n)
	{
		if(n==0)
			return null;
		TreeNode root=null;
		
		for(int i=0;i<n;i++)
		{
			root = createBST(arr[i],root);
		}
		return root;
	}
	
	public static TreeNode createBST(int x,TreeNode root)
	{
		if(root==null)
		{
			root = new TreeNode(x);
			return root;
		}
		
		
		if(x<=root.val)
		{
			root.left=createBST(x,root.left);
		}
		else
			root.right=createBST(x,root.right);
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        int arr[] = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };
        int n = arr.length;
 
        root = constructBst(arr, n);
 
        System.out.print("Inorder Traversal: ");
       // inorderTraversal(root);
	}

}
