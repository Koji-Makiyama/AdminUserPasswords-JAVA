import java.util.Scanner;

class Init {
    public String scan() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    };

    public static void init() {
        Boolean flag1= true;
        while (flag1) {
            System.out.println("Would you like to create an admin(A) account, " +
                "a user(U) account, or exit(E) the wizard? Please enter either A " + 
                "for admin, U for user, or E for exit.");
            Init myInit1 = new Init();
            String scanOutput = myInit1.scan();
            if (scanOutput.equals("A")) {
                flag1 = false;
                Boolean flag2 = true;
                System.out.println("Create Admin account selected. Enter Admin code: (1234). " +
                "This code is provided to allow the user to explore this application.");
                String adminCode = myInit1.scan();
                while (flag2) {
                    if (adminCode.equals("1234")) {
                        flag2 = false;
                    } else {
                        flag2 = true;
                        System.out.println("Invalid Admin code. Try again.");
                        adminCode = myInit1.scan();
                    }
                }
                Admin myAdmin = new Admin();
                myAdmin.setAdminPw();
            } else if (scanOutput.equals("U")) {
                flag1 = false;
                System.out.println("Create User account selected.");
                User myUser = new User();
                myUser.setUserPw();
            } else if (scanOutput.equals("E")) {
                flag1 = false;
                System.out.println("Exiting.");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}