package Concrete;

import Abstract.PlayerCheckServices;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckServices{

	@Override
	public boolean checkIfRealPlayer(Player player) {
		return false;
	}

}
