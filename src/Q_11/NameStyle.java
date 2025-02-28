package Q_09;
import java.util.*;
import java.lang.*;
public class NameStyle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Here : ");
        String fullName = scan.nextLine();
        String[] name = fullName.split(" ");
        System.out.println(name[name.length-1]+","+name[0]+" "+name[1].charAt(0));

    }
}
