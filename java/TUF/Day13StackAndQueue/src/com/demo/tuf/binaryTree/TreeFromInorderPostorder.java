/**
 * 
 */
package com.demo.tuf.binaryTree;

import java.util.HashMap;

/**
 * @author ellit
 *
 */
public class TreeFromInorderPostorder {

	private static HashMap<Character,Integer> hm = new HashMap();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] in = {'D', 'B', 'E', 'A', 'F', 'C'};
	    char[] pre = {'A', 'B', 'D', 'E', 'C', 'F'};
	    int len = in.length;

	    buildTreeWrap(in, pre, len);

	    /* Let us test the built tree by printing 
	        Inorder traversal */
	    System.out.println("Inorder traversal of the constructed tree is");
	    
	}
	
	public static void printInorder(TreeNode root)
	{
		if(root==null)
			return;
		printInorder(root.left);
		System.out.print(" "+(char)root.val);
		printInorder(root.right);
		System.out.println();
	}
	
	public static void buildTreeWrap(char[] in,char[] pre,int len)
	{
		int i;
		for(i=0;i<len;i++)
		{
			hm.put(in[i],i);
		}
		
		TreeNode root = buildTree(in,pre,0,len);
		printInorder(root);
	}
	
	public static TreeNode buildTree(char[] in,char[] pre,int idx,int len)
	{
		if(idx>=len)
			return null;
		
		int val = pre[idx++];
		
		TreeNode temp = new TreeNode(val);
		if(idx==len)
			return temp;
		
		int inIndex = hm.get(in[idx]);
		
		temp.left = buildTree(in,pre,idx,inIndex);
		temp.right = buildTree(in,pre,inIndex+1,len);
		return temp;
	}
}
