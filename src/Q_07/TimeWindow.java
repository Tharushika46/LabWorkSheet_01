package Q_07;
import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeWindow {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); // Corrected pattern
        String formatTime = currentTime.format(formatter); // Corrected variable name
        JFrame timeWindow = new JFrame(); // Corrected variable name
        timeWindow.setSize(400, 500);
        timeWindow.setTitle(formatTime);
        timeWindow.setVisible(true);
    }
}
