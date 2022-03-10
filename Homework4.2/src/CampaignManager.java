
public class CampaignManager {
	public void campaignAdd(Campaign campaign) {
		System.out.println("Kampanya eklendi: "+campaign.getCampaignName());
	}
	public void campaignDelete(Campaign campaign) {
		System.out.println("kampanya silindi: "+campaign.getCampaignName());
	}
	public void campaignDeleted(Campaign campaign) {
		System.out.println("kampanya güncellendi: "+campaign.getCampaignName());
	}
	
}
