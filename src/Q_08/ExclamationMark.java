package Q_08;
import java.util.*;
public class ExclamationMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Here :");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("!");
        for (String word : words) {
            System.out.println(word.trim());
        }
    }
}
