package Concrete;

import Abstract.GameSaleServices;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleServices{

	@Override
	public void gameSell(Player player, Game game, Campaign campaign) {
		
		double priceAfterDiscount = game.getGamePrice()
				- (game.getGamePrice()*campaign.getDiscount()/100); 
		
		System.out.println(player.getName() + " oyuncusuna " 
		+ game.getGamePrice() + "₺ tutarındaki " + game.getGameName() 
		+ " oyunu " + campaign.getCampaignName() + " kampanyası ile % " 
		+ campaign.getDiscount() + " indirimle "  + priceAfterDiscount 
		+ "₺ fiyatına satılmıştır.");
		
	}

}
