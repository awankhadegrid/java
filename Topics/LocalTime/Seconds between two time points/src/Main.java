import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        String time = scanner.next();
        String time2=scanner.next();

        LocalTime localTime1=LocalTime.parse(time);
        LocalTime localTime2=LocalTime.parse(time2);

         int min1=localTime1.toSecondOfDay();
         int min2=localTime2.toSecondOfDay();

         int result=min2-min1;
        System.out.println(Math.abs(
                result
        ));

    }
}