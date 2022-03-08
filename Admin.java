import java.util.Scanner;

class Admin {
    public static String adminname = "Administrator";
    public String adminpw;
    public static void setAdminPw() {
        Admin myAdmin = new Admin();
        System.out.println("Admin class reached. Enter your desired Admin password.");
        Scanner scanner = new Scanner(System.in);
        String adminScan = scanner.next();
        myAdmin.adminpw = adminScan;
        System.out.println("Admin password set to " + myAdmin.adminpw + ".");
    }
}