package Q_05;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DayDisplay {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE,d MMM yyyy");
        System.out.println("Today's Date: " + formatter.format(today) + ".");
    }
}