package Week1;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

	int boundary, number1 = 1, number2 =1, newNumber;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Kaçıncı indise kadar yazdırılacağını giriniz.");
	boundary = scanner.nextInt();
        System.out.print(number1 + "\t" + number2 + "\t");
	for(int i = 0; i<=boundary-2; i++){
	    newNumber = number1 + number2;
        System.out.print(newNumber + "\t");
        number1 = number2;
        number2 = newNumber;
    }
    }
}
