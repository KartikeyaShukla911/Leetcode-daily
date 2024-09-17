package com.demo.tuf;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotting = orangesRotting(arr);
        System.out.println("Minimum Number of Minutes Required "+rotting);
	}
	
	public static int orangesRotting(int arr[][])
	{
		int min_count=0;
		
		int n = arr.length;
		int i,j;
		
		int fresh = 0;
		
		Queue<int[]> q = new LinkedList();
		
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0,};
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i][j]==2)
				{
					
					q.offer(new int[] {i,j});
				}
				else if(arr[i][j]==1) {
					fresh++;
					//freshOrange++;
				}
			}
		}
		
		if(fresh==0)
			return 0;
		
		int cnt=0;
		
		while(!q.isEmpty())
		{
			int size = q.size();
			cnt += size;
			for(i=0;i<size;i++) {
				int[] temp = q.poll();
				int x = temp[0];
				int y = temp[1];
			
			for(i=0;i<4;i++)
			{
				int x_pos = dx[i] + x;
				int y_pos = dy[i] + y;
				
				if(x_pos < 0 || x_pos>=n || y_pos<0 || y_pos>=n)
					continue;
				if(arr[x_pos][y_pos]==0)
					continue;
				if(arr[x_pos][y_pos]==2)
					continue;
//				else if(arr[x_pos][y_pos]==2)
//				{
//					q.add(new int[] {x_pos,y_pos});
//				}
//				if(arr[x_pos][y_pos]==1)
//				{
					arr[x_pos][y_pos]=2;
					
					q.offer(new int[] {x_pos,y_pos});
//				}
				}
			}
			if(q.size()!=0)
				min_count++;
			
			
		}
		System.out.println(min_count);
		return fresh == cnt ? min_count : -1;
	}

}
