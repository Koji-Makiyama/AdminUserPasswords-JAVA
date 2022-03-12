package com.AdminProject.main;
import java.util.Scanner;

class User {
    public String userpw;
    public static void setUserPw(Scanner o) {
        User myUser = new User();
        System.out.println("User class reached. Enter your desired User password.");
        String userScan = o.next();
        myUser.userpw = userScan;
        System.out.println("User password set to " + myUser.userpw + ".");
    }
}
