package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerCheckServices {

	boolean checkIfRealPlayer(Player player) 
			throws NumberFormatException, RemoteException;
}
