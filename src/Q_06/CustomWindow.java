package Q_06;
import java.util.*;
import javax.swing.*;
public class CustomWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title;
        int width;
        int height;
        System.out.print("Enter Window Title : ");
        title = scanner.next();
        System.out.print("Enter Window Width : ");
        width = scanner.nextInt();
        System.out.print("Enter Window Height : ");
        height = scanner.nextInt();
        JFrame window = new JFrame();
        window.setSize(width,height);
        window.setTitle(title);
        window.setVisible(true);
    }
}
