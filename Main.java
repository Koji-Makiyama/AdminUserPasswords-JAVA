// pass scanner around through parameters to avoid the need to create multiple instantiations
// create a class variable list and add admin and user objects to that list (this avoids them from being function scoped and getting lost).

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the admin and user setup wizard. " +
        "This wizard will help you create an admin account or a user account and " +
        "set their passwords.");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Init.init();
            System.out.println("Would you like to exit? (Y/N)");
            String exit = scanner.next();
            if (exit.equals("Y")) {
                scanner.close();
                break;
            } else {
                System.out.println("Looping.");
            }
        }
    }
}
