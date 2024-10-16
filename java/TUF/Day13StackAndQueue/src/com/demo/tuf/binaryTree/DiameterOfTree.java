package com.demo.tuf.binaryTree;

//import com.demo.tuf.TreeNode;

//import javax.swing.tree.TreeNode;

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

public class DiameterOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Diameter or longest path in Tree: "+diameter(root));
	}
	
	public static int diameter(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int[] dia = new int[1];
		dia[0] = height(dia,root);
		return dia[0];
	}
	
	public static int height(int[] dia,TreeNode root)
	{
		if(root==null)
			return 0;
		
		int lh = height(dia,root.left);
		int rh = height(dia,root.right);
		
		dia[0] = Math.max(dia[0], lh + rh);
		
		return 1 + Math.max(lh, rh);
	}

}
