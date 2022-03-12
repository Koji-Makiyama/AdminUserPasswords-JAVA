package com.AdminProject.main;
import java.util.Scanner;

class User {
    public static String username;
    public String userpw;

    public static void setUserPw(Scanner o) {
        User u01 = new User();
        System.out.println("Enter your desired User name.");
        String userScan1 = o.next();
        u01.username = userScan1;
        System.out.println("Admin class created. Enter your desired Admin password for " + userScan1 + ".");
        String adminScan2 = o.next();
        u01.userpw = adminScan2;
        System.out.println("Admin password set to " + adminScan2 + " for " + userScan1 + ".");
        Main.userlist.add(u01);
    }
}
