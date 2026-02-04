import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int totalSeconds = scanner.nextInt();

        int hours = (totalSeconds / 3600) % 24;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String timeFormat;
        if (seconds == 0) {
            timeFormat = String.format("%02d:%02d", hours, minutes);
        } else {
            timeFormat = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        }

        System.out.println(timeFormat);

    }
}