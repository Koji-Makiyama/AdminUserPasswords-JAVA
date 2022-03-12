package com.AdminProject.main;
import java.util.Scanner;

class Init {
    public String scan(Scanner o) {
        String input = o.next();
        return input;
    };
    public static void init(Scanner o) {
        Init i = new Init();
        Boolean flag1= true;
        while (flag1) {
            System.out.println("Would you like to create an admin(A) account, " +
                    "a user(U) account, or exit(E) the wizard? Please enter either A " +
                    "for admin, U for user, or E for exit.");
            String scanOutput = i.scan(o);
            if (scanOutput.equals("A")) {
                flag1 = false;
                Boolean flag2 = true;
                System.out.println("Create Admin account selected. Enter Admin code: (1234). " +
                        "This code is provided to allow the user to explore this application.");
                String adminCode = i.scan(o);
                while (flag2) {
                    if (adminCode.equals("1234")) {
                        flag2 = false;
                    } else {
                        flag2 = true;
                        System.out.println("Invalid Admin code. Try again.");
                        adminCode = i.scan(o);
                    }
                }
                Admin.setAdminPw(o);
            } else if (scanOutput.equals("U")) {
                flag1 = false;
                System.out.println("Create User account selected.");
                User.setUserPw(o);
            } else if (scanOutput.equals("E")) {
                flag1 = false;
                System.out.println("Exiting. Please confirm.");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
