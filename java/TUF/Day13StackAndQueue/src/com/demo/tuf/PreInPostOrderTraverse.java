package com.demo.tuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//class Pair
//{
//	Node node;
//	Integer val;
//	
//	public Pair(Node node,Integer val)
//	{
//		this.node = node;
//		this.val = val;
//	}
//}
//
//class Node
//{
//	int val;
//	Node left;
//	Node right;
//	
//	public Node(int val)
//	{
//		this.val = val;
//		this.left=null;
//		this.right = null;
//	}
//}

public class PreInPostOrderTraverse {
	
	public static void printPreInPostTraverse(TreeNode root)
	{
		if(root==null)
			return;
		
		List<Integer> preOrder = new ArrayList();
		List<Integer> inOrder = new ArrayList();
		List<Integer> postOrder = new ArrayList();
		
		
		Pair pair = new Pair(root,1);
		Stack<Pair> st = new Stack();
		
		st.push(pair);
		while(!st.isEmpty())
		{
			Pair tempPair = st.peek();
			TreeNode temp = tempPair.node;
			int val = tempPair.val;
			st.pop();
			if(val==1)
			{
				
				preOrder.add(temp.val);
				
				if(temp.left!=null)
					st.push(new Pair(temp,2));
			}
			
			else if(val==2)
			{
				inOrder.add(temp.val);
				
				if(temp.right!=null)
					st.push(new Pair(temp,3));
			}
			else
			{
				postOrder.add(temp.val);
				
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
