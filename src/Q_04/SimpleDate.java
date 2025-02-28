package Q_04;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDate {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("d MMM yyyy");
        System.out.println("Today's Date: " + formatter.format(today) + ".");
    }
}
