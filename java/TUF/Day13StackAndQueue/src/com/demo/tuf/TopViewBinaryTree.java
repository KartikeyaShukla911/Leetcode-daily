package com.demo.tuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.*;;

//import com.demo.tuf.LFUcache.Pair;

class Pair
{
	TreeNode node;
	Integer val;
	
	public Pair(TreeNode node,Integer val)
	{
		this.node = node;
		this.val = val;
	}
}

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


public class TopViewBinaryTree {
	
	public static List<Integer> topViewBT(TreeNode root)
	{
		if(root==null)
			return null;
		
		List<Integer> ans = new ArrayList();
		
		int mini=99999,maxi=0;
		
//		HashMap<TreeNode,Integer> pair = new HashMap();
//		Map<TreeNode,Integer> pair = new AbstractMap.SimpleEntry(TreeNode, Integer);
		Map<Integer,Integer> hm = new HashMap();
		
		Queue<Pair> q = new LinkedList<>();
		Pair pair = new Pair(root,0);
		q.add(pair);
		
		while(!q.isEmpty())
		{
			Pair temp = q.poll();
			TreeNode curr = temp.node;
			int index = temp.val;
			
			mini = Math.min(mini, index);
			maxi = Math.max(maxi,index);
			
			if(!hm.containsKey(index))
			{
				hm.put(index, curr.val);
			}
			
			if(curr.left!=null)
			{
				Pair tempPair = new Pair(curr.left,index-1);
				q.add(tempPair);
			}
			
			if(curr.right!=null) {
				Pair tempPair = new Pair(curr.right,index+1);
				q.add(tempPair);
			}
		}
		
		for(Map.Entry<Integer, Integer> x : hm.entrySet())
		{
			ans.add(x.getValue());
		}
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("TopView of a Binary Tree");
		
		TreeNode root = new TreeNode(1);
		
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(11);
        root.right.left = new TreeNode(9);
		
		for(int x : topViewBT(root))
		{
			System.out.print(" "+x);
		}
	}

}
