package Concrate;

import Abstract.BaseSalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.List;

public class SalesManagement implements BaseSalesManagement {

    @Override
    public void buy(Gamer gamer, Game game) {
        gamer.getGames().add(game);
        System.out.println(gamer.getFirstName() + " " + game.getName() + " oyununa kayıt oldunuz");

    }

    @Override
    public void campaignBuy(Gamer gamer, Campaign campaign) {
        gamer.getCampaigns().add(campaign);
        System.out.println("Tebrikler! " + gamer.getFirstName() + " "+ campaign.getName() + " oyununu % " +
                campaign.getDiscountRate() + " indirimle satın aldınız.");
    }

}
