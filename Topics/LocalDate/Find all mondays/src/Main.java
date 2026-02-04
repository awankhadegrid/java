import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        scanner.close();

        // Create a YearMonth object for the specified month and year
        YearMonth yearMonth = YearMonth.of(year, month);
        // Get the first day of that month
        LocalDate date = yearMonth.atDay(1);
        // Get the last day of that month
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Iterate through the days of the month
        while (!date.isAfter(lastDay)) {
            // Check if the current day is a Monday
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            // Move to the next day
            date = date.plusDays(1);
        }
    }
}