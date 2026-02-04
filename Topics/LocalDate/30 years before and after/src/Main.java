import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputDate = sc.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate date1 = date.minusYears(30);
        LocalDate date2 = date.plusYears(30);

        System.out.println(date1.format(formatter));
        System.out.println(date2.format(formatter));
    }
}
