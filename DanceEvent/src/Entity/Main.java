package Entity;

import Helper.HelperClass;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose your option (1-4) " +
                "\n1. Line-up Friday \n" +
                "2. Line-up Saturday \n" +
                "3. Line-up Sunday \n" +
                "4. Write a review");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("19.00 - DJ Tiësto \n" + "20.00 - Armin van Buuren \n" + "21.30 - Martin Garrix \n");
            System.out.println("Choose your option (1-3)" +
                    "\n1. See line-up Saturday \n" +
                    "2. See line-up Sunday \n" +
                    "3. Go back to main menu");
            option = input.nextInt();
        } else if (option == 2) {
            System.out.println("19.00 - Afrojack \n" + "20.00 - Skrillex \n" + "21.30 - Avicii \n");
        } else if (option == 3) {
            System.out.println("16.00 - DJ Jean \n" + "17.00 - Diplo \n" + "18.30 - Steve Aoki \n");
        } else if (option == 4) {
            System.out.println("Fill in your display name and email address");
        } else {
            System.out.println("Invalid option, try again");
            option = input.nextInt();
        }

        while (option == 1 | option == 2 | option == 3 | option == 4) {
            System.out.println("\n1. Line-up Friday \n" +
                    "2. Line-up Saturday \n" +
                    "3. Line-up Sunday \n" +
                    "4. Write a review");

        }

    }
}


