package com.demo.tuf.bst;

public class InOrderPreceddorSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        TreeNode[] pre = {null};
        TreeNode[] suc  = {null};
        preccedorSuccessor(root,pre,suc,3);
        System.out.println("Precessdor  "+pre[0].val+" Successor: "+suc[0].val);
	}
	
	public static void preccedorSuccessor(TreeNode root, TreeNode[] pre,TreeNode[] suc,int key)
	{
		if(root==null)
			return;
		
		preccedorSuccessor(root.left, pre, suc,key);
		
		if(root.val > key) {
			if(suc[0]==null || (suc[0]!=null && suc[0].val >=root.val))
			{
				suc[0]=root;
			}
		
		} else if (root.val < key)
		{
			pre[0]=root;
			
		}
		preccedorSuccessor(root.right, pre, suc,key);
	}
}
