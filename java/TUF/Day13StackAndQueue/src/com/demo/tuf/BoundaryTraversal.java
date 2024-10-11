/**
 * 
 */
package com.demo.tuf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ellit
 *
 */
public class BoundaryTraversal {

	public static void boundaryTravel(TreeNode root,List<Integer> ans)
	{
		if(root==null)
			return ;
		
		travelLeft(root,ans);
		travelLeaf(root,ans);
		travelRight(root,ans);
		
		for(int x : ans)
		{
			System.out.print(" "+x);
		}
	}
	
	public static void travelLeft(TreeNode root,List<Integer> ans)
	{
		if(root==null)
			return;
		
		if(isLeaf(root)==true)
			return ;
		
		ans.add(root.val);
		
		if(root.left!=null)
		{
			travelLeft(root.left,ans);
		}
		if(root.right!=null)
		{
			travelLeft(root.right,ans);
		}
	}
	
	public static void travelRight(TreeNode root,List<Integer> ans)
	{
		if(root==null)
			return;
		
		if(isLeaf(root)==true)
			return ;
		
		ans.add(root.val);
		
		
		if(root.right!=null)
		{
			travelRight(root.right,ans);
		}
		if(root.left!=null)
		{
			travelRight(root.left,ans);
		}
	}
	
	public static void travelLeaf(TreeNode root,List<Integer> ans)
	{
		if(root==null)
			return;
		
		if(isLeaf(root)==true)
			ans.add(root.val);
		
		
		
		if(root.left!=null)
		{
			travelLeaf(root.left,ans);
		}
		if(root.right!=null)
		{
			travelLeaf(root.right,ans);
		}
	}
	
	public static boolean isLeaf(TreeNode root)
	{
		if(root==null)
			return true;
		
		if(root.left==null && root.right==null)
			return true;
		return false;
	}
	
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
        List<Integer> ans = new ArrayList();
        boundaryTravel(root,ans);
        
	}

}
