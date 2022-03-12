package com.AdminProject.main;
import java.util.Scanner;

class Admin {
    public static String adminname;
    public String adminpw;

    public static void setAdminPw(Scanner o) {
        Admin a01 = new Admin();
        System.out.println("Enter your desired Administrator name.");
        String adminScan1 = o.next();
        a01.adminname = adminScan1;
        System.out.println("Admin class created. Enter your desired Admin password for " + adminScan1 + ".");
        String adminScan2 = o.next();
        a01.adminpw = adminScan2;
        System.out.println("Admin password set to " + adminScan2 + " for " + adminScan1 + ".");
        Main.adminlist.add(a01);
    }
}
