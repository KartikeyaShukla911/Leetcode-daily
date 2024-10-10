package com.demo.tuf;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character,Integer> hm = new HashMap();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 10000);
		
		
		String roman = "XIV";
		
		System.out.println("Integer: "+findInt(roman,hm));
		
	}
	
	public static int findInt(String roman,HashMap<Character,Integer> hm)
	{
		int res = 0;
		
		int i,j;
		int n = roman.length();
		
		for(i=0;i<n;i++)
		{
			int c1 = hm.get(roman.charAt(i));
			
			if(i+1<n)
			{
				int c2 = hm.get(roman.charAt(i+1));
				
			}
		}
	}

}
