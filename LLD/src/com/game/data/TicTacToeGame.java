package com.game.data;

import java.util.Deque;
import java.util.LinkedList;

import com.game.icons.PieceTypeO;
import com.game.icons.PieceTypeX;
import com.game.value.Board;
import com.game.value.Player;

public class TicTacToeGame {

	Deque<Player> players;
	Board gameBoard;
	
	public void initializeGame()
	{
		players = new LinkedList();
		PieceTypeX pieceX = new PieceTypeX();
		Player player1 = new Player("player1",pieceX);
		
		PieceTypeO pieceO = new PieceTypeO();
		Player player2 = new Player("player2", pieceO);
		
		players.add(player1);
		players.add(player2);
		
		gameBoard = new Board(3);
	}
	
	public String startGame()
	{
		boolean noWinner = true;
		while(noWinner)
		{
			//take out players turn
			
			// get free spaces from boar
			
			// read user input
			
			// place the piece
			
			//check the winner
		}
	}
	
	public boolean isThereWinner()
	{
		
	}
}
