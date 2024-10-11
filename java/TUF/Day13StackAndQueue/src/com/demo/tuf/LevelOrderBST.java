package com.demo.tuf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBST {

	public static List<List<Integer>> levelTraversal(TreeNode root)
	{
		if(root==null)
			return new ArrayList();
		
		
		List<List<Integer>> res = new ArrayList();
		Queue<TreeNode> q = new LinkedList();
		
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			int n = q.size();
			List<Integer> ans = new ArrayList();
			for(int i=0;i<n;i++)
			{
				TreeNode temp = q.poll();
				
				ans.add(temp.val);
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
			}
			
			res.add(ans);
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        List<List<Integer>> res = levelTraversal(root);
        
        for(List<Integer> ls : res)
        {
        	System.out.println(ls.toString());
        }
	}

}
