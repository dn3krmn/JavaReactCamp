package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSaleServices {

	void gameSell(Player player, Game game, Campaign compaign);
}
