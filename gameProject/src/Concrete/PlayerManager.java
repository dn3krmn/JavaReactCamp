package Concrete;

import java.rmi.RemoteException;

import Abstract.PlayerCheckServices;
import Abstract.PlayerServices;
import Entities.Player;

public class PlayerManager implements PlayerServices{
	
	private PlayerCheckServices checkServices;

	public PlayerManager(PlayerCheckServices checkServices) {
		super();
		this.checkServices = checkServices;
	}

	@Override
	public void addPlayer(Player player) throws NumberFormatException, RemoteException {
		if(checkServices.checkIfRealPlayer(player)) {
			System.out.println(player.getName() + " oyuncusu eklendi.");
		} else {
			System.out.println("Girilen kullanıcı bilgileri hatalı olduğu için"
					+ "kullanıcı eklenemedi!");
		}
		
	}

	@Override
	public void deletePlayer(Player player) {
		System.out.println(player.getName() + " oyuncusu silindi.");
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getName() + " oyuncusunun bilgileri "
				+ "güncellendi.");
		
	}
}
