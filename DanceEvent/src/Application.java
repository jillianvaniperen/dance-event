import entity.DJ;
import entity.Set;
import helper.HelperDJ;
import helper.HelperSet;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static helper.HelperApplication.*;

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

        HelperDJ helperDJ = new HelperDJ();

        helperDJ.save(new DJ(1,"DJ Jean", "Mellow"));
        helperDJ.save(new DJ(2,"La Fuente", "Retro"));
        helperDJ.save(new DJ(3,"Marboo", "Retro"));

        HelperSet helperSet = new HelperSet();

        helperSet.save(new Set(1, "Mellow Yellow", "17.00", "21.00", "Friday", "Main stage"));
        helperSet.save(new Set(2, "Strictly Ballroom", "13:00", "15:00", "Saturday", "Small stage"));

    }
}

