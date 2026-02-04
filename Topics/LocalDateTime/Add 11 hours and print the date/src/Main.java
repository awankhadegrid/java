import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        DateTimeFormatter inputFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm[:ss]");
        DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Scanner scanner = new Scanner(System.in);
        String inputDateTimeString = scanner.nextLine();

        LocalDateTime localDateTime =
                LocalDateTime.parse(inputDateTimeString, inputFormatter);

        LocalDateTime resultDateTime = localDateTime.plusHours(11);

        System.out.println(resultDateTime.format(outputFormatter));
    }
}
