import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String timeInput = sc.next();     // e.g. 22:20
        int hour = sc.nextInt();          // hours to subtract
        int min = sc.nextInt();           // minutes to subtract

        LocalTime time = LocalTime.parse(timeInput);
        LocalTime result = time.minusHours(hour).minusMinutes(min);

        System.out.println(result);
    }
}
