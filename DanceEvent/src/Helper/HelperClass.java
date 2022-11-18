package Helper;

public class HelperClass {

    public static boolean isValidEmailaddress(String email) {
        return true; // aanpassen!
    }

    public static boolean hasValidLength(int length) {
        return (length <= 200);
    }

    public static boolean checkComment() {
        return true; // aanpassen!
    }

    // Option application menu
    public static void menuOption1() {
        System.out.println("Line-up Friday");
        System.out.println("19.00 - DJ Tiësto \n" + "20.00 - Armin van Buuren \n" + "21.30 - Martin Garrix \n");
    }

    public static void menuOption2() {
        System.out.println("Line-up Saturday");
    }

    public static void menuOption3() {
        System.out.println("Line-up Sunday");
    }

    public static void menuOption4() {
        System.out.println("Write a review");
    }
}

// voeg deze class nog toe aan Git en pas code aan

//   System.out.println("19.00 - DJ Tiësto \n" + "20.00 - Armin van Buuren \n" + "21.30 - Martin Garrix \n");
//           System.out.println("Choose your option (1-3)" +
//           "\n1. See line-up Saturday \n" +
//           "2. See line-up Sunday \n" +
//           "3. Go back to main menu");
//           option = input.nextInt();
//           } else if (option == 2) {
//           System.out.println("19.00 - Afrojack \n" + "20.00 - Skrillex \n" + "21.30 - Avicii \n");
//           } else if (option == 3) {
//           System.out.println("16.00 - DJ Jean \n" + "17.00 - Diplo \n" + "18.30 - Steve Aoki \n");
//           } else if (option == 4) {
//           System.out.println("Fill in your display name and email address");
//           } else {
//           System.out.println("Invalid option, try again");