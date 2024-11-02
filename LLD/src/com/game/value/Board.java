package com.game.value;

import java.util.ArrayList;
import java.util.List;

public class Board {

	public int size;
	public PlayingPiece[][] board;
	
	public Board(int size)
	{
		this.size = size;
		board = new PlayingPiece[size][size];
	}
	
	public boolean addPiece(int row,int col,PlayingPiece playingPiece)
	{
		if(board[row][col]!=null)
		{
			return false;
		}
		
		board[row][col]=playingPiece;
		
		return true;
	}
	
	public List<Pair> getFreeCells()
	{
		List<Pair> freeCells = new ArrayList();
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(board[i][j]==null)
				{
					Pair pair = new Pair(i,j);
					int first = pair.First();
					int second = pair.Second();
					
					freeCells.add(pair);
				}
			}
		}
		return freeCells;
	}
	
	public void printBoard()
	{
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
		}
	}
}
