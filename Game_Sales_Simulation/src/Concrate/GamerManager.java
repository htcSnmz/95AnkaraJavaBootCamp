package Concrate;

import Abstract.BaseGamerService;
import Entities.Gamer;

import java.util.List;
import java.util.Scanner;

public class GamerManager implements BaseGamerService {

    private List<Gamer> gamerList;

    public GamerManager(List<Gamer> gamerList) {
        this.gamerList = gamerList;
    }

    @Override
    public void save(Gamer gamer) {
        gamerList.add(gamer);
        System.out.println(gamer.getFirstName() + " kaydınız gerçekleştirildi.");
    }

    @Override
    public void update(Gamer gamer) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Güncellemek istediğiniz bilgiyi seçin\n'A'-AD  'S'-SOYAD   'M'-MAIL   'P'-PAROLA");
        char choose = scan.nextLine().charAt(0);
        System.out.println("Yeni değeri girin");
        String newVar = scan.nextLine();
        switch (choose) {
            case 'A':
                gamer.setFirstName(newVar);
                break;
            case 'S':
                gamer.setLastName(newVar);
                break;
            case 'M':
                gamer.seteMail(newVar);
                break;
            case 'P':
                gamer.setPassword(newVar);
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
        }
        System.out.println("Bilgileriniz güncellendi " + gamer.getFirstName());
    }

    @Override
    public void delete(Gamer gamer) {
        gamerList.remove(gamer);
        System.out.println("Kayıt silindi");
    }
}
