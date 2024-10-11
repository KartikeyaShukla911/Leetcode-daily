/**
 * 
 */
package com.demo.tuf;

/**
 * @author ellit
 *
 */
public class CheckBTbalanceOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //root.left.right.right = new TreeNode(7);
        
        System.out.println("Is Balanced? "+checkBT(root));
	}
	
	public static boolean checkBT(TreeNode root)
	{
		if(root==null)
			return true;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(Math.abs(rh-lh)>1 && checkBT(root.left) && checkBT(root.right))
			return false;
		return true;
	}
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
	
		return 1+Math.max(height(root.left), height(root.right));
	}

}
