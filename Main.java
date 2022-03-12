// create a class variable list and add admin and user objects to that list (this avoids them from being function scoped and getting lost).
package com.AdminProject.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the admin and user setup wizard. " +
                "This wizard will help you create an admin account or a user account and " +
                "set their passwords.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Init.init(scanner);
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
