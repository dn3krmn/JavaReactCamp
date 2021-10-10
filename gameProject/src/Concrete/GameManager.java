package Concrete;

import Abstract.GameServices;
import Entities.Game;

public class GameManager implements GameServices{

	@Override
	public void addGame(Game game) {
		System.out.println("Oyun eklendi : " + game.getGameName());
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Oyun silindi : " + game.getGameName());
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Oyun güncellendi : " + game.getGameName());
		
	}

}

