package com.demo.tuf;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Kartik
 *
 */
public class LRUCache {
	
	HashMap<Integer,Node> hm;
	Node head,tail;
	int capacity;
	int size=0;
	
	public LRUCache(int capacity)
	{
		head = new Node(0);
		tail = new Node(0);
		this.capacity = capacity;
		this.head.val=0;
		this.tail.val=0;
		this.head.next=tail;
		this.head.prev=null;
		this.tail.next=null;
		this.tail.prev=head;
	}
	
	public int get(int x)
	{
		if(hm.containsKey(x))
		{
			Node temp = hm.get(x);
			Node prevNode = temp.prev;
			prevNode.next = temp.next;
			temp.prev=null;
			temp.next = null;
			head.next = temp;
			temp.prev=head;
		}
		else
		{
			if(size==capacity)
			{
				size--;
				Node temp = tail.prev;
				tail.prev = temp.prev;
				temp.next = null;
			}
			
			Node temp = new Node(x);
			temp.next = head.next;
			head.next = temp;
			temp.prev = head;
			
			System.out.print("Miss");
		}
		return x;
	}	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
