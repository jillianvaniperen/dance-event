import java.util.NoSuchElementException;
import java.util.Scanner;

import static Helper.HelperClass.*;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option = 0;
        do {
            System.out.println("Choose your option (1-4) \n" +
                    "1. Line-up Friday \n" +
                    "2. Line-up Saturday \n" +
                    "3. Line-up Sunday \n" +
                    "4. Write a review");

            try {
                option = input.nextInt();
            } catch (NoSuchElementException ex) {
                input.next();
            }

            if (option == 1) {
                menuOption1();
            } else if (option == 2) {
                menuOption2();
            } else if (option == 3) {
                menuOption3();
            } else if (option == 4) {
                menuOption4();
            } else {
                System.out.println("Invalid option, try again");
            }
        } while (option > 4 || option < 1);
    }
}

