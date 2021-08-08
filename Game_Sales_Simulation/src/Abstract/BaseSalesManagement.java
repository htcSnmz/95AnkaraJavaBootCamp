package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public interface BaseSalesManagement {
   void buy(Gamer gamer, Game game);
   void campaignBuy(Gamer gamer,Campaign campaign);
}
