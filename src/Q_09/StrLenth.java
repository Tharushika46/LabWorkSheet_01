package Q_09;
import java.util.*;
public class StrLenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Here : ");
        String sentence = scan.nextLine();
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));

    }

}
