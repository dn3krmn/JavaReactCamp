package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerServices {
	void addPlayer(Player player) throws NumberFormatException, RemoteException;
	void deletePlayer(Player player);
	void updatePlayer(Player player);

}
