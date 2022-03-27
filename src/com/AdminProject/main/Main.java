package com.AdminProject.main;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Object> adminlist = new ArrayList<Object>();
    static ArrayList<Object> userlist = new ArrayList<Object>();

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the admin and user setup wizard. " +
                "This wizard will help you create an admin account or a user account and " +
                "set their passwords.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Init.init(scanner);
            System.out.println("Would you like to exit (Y/N)?");
            String exit = scanner.next();
            if (exit.equals("Y")) {
                scanner.close();
                break;
            } else {
                System.out.println("Invalid input. Looping.");
            }
        }
    }
}
