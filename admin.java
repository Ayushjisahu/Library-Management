import java.util.Scanner;

interface Authentication {
    void logIn();
}

class Admin implements Authentication {
    String userName;
    String password;

    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Username : ");
        this.userName = scanner.nextLine();
        System.out.println("Enter the Password : ");
        this.password = scanner.nextLine();
        // scanner.close(); // Avoid closing System.in wrapped Scanner
    }
}

class User implements Authentication {
    String userName;
    String password;

    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Student!");
        System.out.println("Enter the Username : ");
        this.userName = scanner.nextLine();
        System.out.println("Enter the Password : ");
        this.password = scanner.nextLine();
        // scanner.close(); // Avoid closing System.in wrapped Scanner
    }
}

class Students extends User {
    String type = "students";
}

class Faculty extends User {
    String type = "faculty";

    @Override
    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Teacher!");
        System.out.println("Enter the Username : ");
        this.userName = scanner.nextLine();
        System.out.println("Enter the Password : ");
        this.password = scanner.nextLine();
        // scanner.close(); // Avoid closing System.in wrapped Scanner
    }
}

public class Library {

    public static void main(String[] args) {
        User u1 = new User();
        u1.logIn();
    }
}
