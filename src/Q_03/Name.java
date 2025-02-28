package Q_03;

import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        System.out.print("Enter Your First Name : ");
        firstName = scanner.next();
        System.out.print("Enter Your Middle Name : ");
        middleName = scanner.next();
        System.out.print("Enter Your Last Name : ");
        lastName = scanner.next();
        char[] middle = middleName.toUpperCase().toCharArray();
        String fullname = firstName + " " + middle[0] + ". " +lastName;
        System.out.println(fullname);
    }
}
