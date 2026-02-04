import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String datetime = sc.next();

        DateTimeFormatter formater=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime time=LocalDateTime.parse(datetime,formater);

        LocalDateTime startofyear=LocalDateTime.of(time.getYear(),1,1,0,0,0);
        Duration duration= Duration.between(time,startofyear);
        System.out.println(Math.abs(duration.toHours()));

    }
}