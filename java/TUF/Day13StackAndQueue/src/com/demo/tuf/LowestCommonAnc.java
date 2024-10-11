/**
 * 
 */
package com.demo.tuf;

/**
 * @author ellit
 *
 */
public class LowestCommonAnc {

	/**
	 * @param args
	 */
	
	public static TreeNode lca(TreeNode root,TreeNode p,TreeNode q)
	{
		if(root==null || p==null || q==null)
			return null;
		
		TreeNode lh = lca(root.left,p,q);
		TreeNode rh = lca(root.right,p,q);
		
		if(lh==null && rh!=null)
			return rh;
		if(lh!=null && rh==null)
			return lh;
		
		else
			return root;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("LCA "+lca(root,root.left.left,root.left.right).val);
	}

}
