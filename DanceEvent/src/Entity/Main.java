package Entity;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose your option (1-4): " +
                "\n1. Line up Friday \n" +
                "2. Line up Saturday \n" +
                "3. Line up Sunday \n" +
                "4. Write a review");
        String option = input.nextLine();
    }
}
