package gameProject;

import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) 
			throws NumberFormatException, RemoteException {

		// Oyuncu ekleme
		Player player = new Player(1, "Döne", "Karaman", "35947874018", 1998);

		PlayerManager playerManager = new PlayerManager
				(new MernisServiceAdapter());
		playerManager.addPlayer(player);

		// Oyun ekleme
		Game game = new Game(1, "PUBG", 69);

		GameManager gameManager = new GameManager();
		gameManager.addGame(game);

		// İndirim ekleme
		Campaign campaign = new Campaign(1, "Sepette Ek İndirim", 15);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.gameSell(player, game, campaign);

	}

}
