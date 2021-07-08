import java.text.DecimalFormat;
import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {

        final double PER_PEAR = 2.14, PER_APPLE = 3.67, PER_TOMATOES = 1.11, PER_BANANA = 0.95, PER_EGGPLANT = 5.0;
        double kgPear, kgApple, kgTomatoes, kgBanana, kgEggplant, total = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        kgPear = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        kgApple = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        kgTomatoes = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        kgBanana = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        kgEggplant = input.nextDouble();

        total = (kgPear*PER_PEAR) + (kgApple*PER_APPLE) + (kgTomatoes*PER_TOMATOES) +
                (kgBanana*PER_BANANA) + (kgEggplant*PER_EGGPLANT);
        System.out.print("Toplam tutar : " + new DecimalFormat("##.##").format(total));
    }
}
