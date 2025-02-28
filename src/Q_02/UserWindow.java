package Q_02;
import java.util.*;
import javax.swing.*;
public class UserWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String secondName;
        System.out.print("Enter Your First Name : ");
        firstName = scanner.next();
        System.out.print("Enter Your Second Name : ");
        secondName = scanner.next();
        String fullName = firstName + " " + secondName;
        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setTitle(fullName);
        window.setVisible(true);
    }

}
