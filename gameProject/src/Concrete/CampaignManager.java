package Concrete;

import Abstract.CampaignServices;
import Entities.Campaign;

public class CampaignManager implements CampaignServices{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());
		
	}

	@Override
	public void updatCampaign(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampaignName());
		
	}

}
