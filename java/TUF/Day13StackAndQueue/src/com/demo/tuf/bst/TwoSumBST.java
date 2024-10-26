package com.demo.tuf.bst;

import java.util.HashSet;

public class TwoSumBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        HashSet<Integer> hs = new HashSet();
        System.out.println("Two sum in BST: "+twoSum(root,3,hs));
	}

	public static boolean twoSum(TreeNode root,int key,HashSet<Integer> hs)
	{
		if(root==null)
			return false;
		
		if(hs.contains(Math.abs(root.val-key)))
			return true;
		
		hs.add(root.val);
		
		return twoSum(root.left,key,hs) || twoSum(root.right,key,hs);
	}
}
