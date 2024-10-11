/**
 * 
 */
package com.demo.tuf;

/**
 * @author ellit
 *
 */
public class CheckTwoTrees {
	
	public static boolean checkTree(TreeNode root1,TreeNode root2)
	{
		if(root1==null && root2==null)
			return true;
		
		if(root1==null || root2==null)
			return false;
		
		return (root1.val==root2.val && checkTree(root1.left,root2.left) && checkTree(root1.right,root2.right));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        
        System.out.println("2 Tree equal? "+checkTree(root1,root2));
	}

}
