import java.util.Scanner;

class User {
    public String userpw; 
    public static void setUserPw() {
        User myUser = new User();
        System.out.println("User class reached. Enter your desired User password.");
        Scanner scanner = new Scanner(System.in);
        String userScan = scanner.next();
        myUser.userpw = userScan;
        System.out.println("User password set to " + myUser.userpw + ".");
    }
}