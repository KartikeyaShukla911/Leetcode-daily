package com.game.start;

import com.game.data.TicTacToeGame;

public class MainGame {
ō
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=3;
		TicTacToeGame obj = new TicTacToeGame(size);
		
		obj.initialize();
		obj.startGame();
	}

}
