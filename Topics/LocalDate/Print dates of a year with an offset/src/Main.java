import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputDate = sc.nextLine();
        int offset = sc.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        int year = date.getYear();

        while (date.getYear() == year) {
            System.out.println(date.format(formatter));
            date = date.plusDays(offset);
        }
    }
}
