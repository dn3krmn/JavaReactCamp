package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckServices;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckServices{

	@Override
	public boolean checkIfRealPlayer(Player player) 
			throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula
				(Long.parseLong(player.getNationalityId()), 
						player.getName().toUpperCase(), 
						player.getSurname().toUpperCase(), 
						player.getDateOfBirth());
		if(result) {
			System.out.println("Başarılı");
		} else {
			System.out.println("Başarısız");
		}
		
		return result;
	}

}
