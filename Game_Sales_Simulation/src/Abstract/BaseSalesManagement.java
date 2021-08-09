package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public interface BaseSalesManagement {
   void buy(Gamer gamer, List<Game> gameListe);
   void campaignBuy(Gamer gamer, List<Campaign> campaignList);
}
