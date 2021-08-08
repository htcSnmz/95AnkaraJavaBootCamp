import Abstract.BaseGamerService;
import Abstract.BaseSalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.List;
import java.util.Scanner;

public class Start {

    static Scanner scan = new Scanner(System.in);

    private BaseGamerService gamerService;
    private BaseSalesManagement salesManagement;
    private List<Game> gameList;
    private List<Campaign> campaignList;
    private List<Gamer> gamerList;


    public Start(BaseGamerService gamerService, BaseSalesManagement salesManagement, List<Game> gameList,
                 List<Gamer> gamerList, List<Campaign> campaignList) {
        this.gamerService = gamerService;
        this.salesManagement = salesManagement;
        this.gameList = gameList;
        this.gamerList = gamerList;
        this.campaignList = campaignList;
    }

    public void startProgram() {


        System.out.println("\n1-KAYIT OL     2-OYUN SATIN AL     3-KAMPANYALI OYUN SATIN AL     4-ÇIKIŞ");

        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        if (choose == 4) {
            System.out.println("Sistemden çıkılıyor.");
            return;
        } else if (choose == 1) {
            register();
        } else if (choose == 2 || choose == 3) {

            gameSale(choose);
        } else {
            System.out.println("Yanlış seçim yapıldı");
            startProgram();
        }


    }

    public void gameSale(int choose) {

        System.out.println("Sırasıyla e-mail ve parolanızı girin:");
        String mail = scan.nextLine();
        String password = scan.nextLine();

        for (Gamer gamers : gamerList) {
            if (gamers.getPassword().equals(password) && gamers.geteMail().equals(mail)) {
                Gamer gamer = gamers;
                if (choose == 2) {
                    int i = 0;
                    for (Game games : gameList) {
                        System.out.println(i + "--> " + games.getName() + " " + games.getPrice() + " TL");
                        i++;
                    }
                    System.out.println("Oyunlar listelendi. Bir seçim yapın.");
                    int gameChoose = scan.nextInt();
                    salesManagement.buy(gamer, gameList.get(gameChoose));
                    startProgram();
                } else if (choose == 3) {
                    int i = 0;
                    for (Campaign campaigns : campaignList) {
                        System.out.println(i + "--> " + campaigns.getName() + " % " + campaigns.getDiscountRate() + " indirimli");
                        i++;
                    }
                    System.out.println("Kampanyalı oyunlar listelendi. Bir seçim yapın.");
                    int campaingGameChoose = scan.nextInt();
                    salesManagement.campaignBuy(gamer, campaignList.get(campaingGameChoose));
                    startProgram();
                }
            }

        }
        System.out.println("Kullanıcı adı ya da parolanız yanlış. Veya sistemde kaydınız yok.");
        startProgram();
    }

    public void register() {

        Gamer gamer = new Gamer();
        System.out.println("Adınızı girin:");
        gamer.setFirstName(scan.nextLine());
        System.out.println("Soyadınızı girin:");
        gamer.setLastName(scan.nextLine());
        System.out.println("Mailinizi girin:");
        gamer.seteMail(scan.nextLine());
        System.out.println("Parolanızı girin:");
        gamer.setPassword(scan.nextLine());
        gamerService.save(gamer);
        startProgram();
    }

}




