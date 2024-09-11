package com.demo.tuf;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LFUcache {
	
	int capacity;
	HashMap<Integer,Pair> hm;
	PriorityQueue<Pair> pq;
	
	public LFUcache(int capacity)
	{
		this.capacity = capacity;
		
		this.hm = new HashMap();
		this.pq = new PriorityQueue<>((a,b)->a.freq - b.freq);
	}
	
	public  int get(int x)
	{
		if(hm.containsKey(x))
		{
			
			Pair pair = hm.get(x);
			pair.freq +=1;
			pq.remove(pair);
			pq.add(pair);
		}
		else
		{
			if(pq.size()==capacity)
			{
				pq.poll();
			}
			
			Pair pair = new Pair(x,1);
			pq.add(pair);
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public class Pair
	{
		int val;
		int freq;
		
		public Pair(int val,int freq)
		{
			this.val = val;
			this.freq = freq;
		}
	}

}

