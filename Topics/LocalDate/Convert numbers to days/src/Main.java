import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int day1=sc.nextInt();
        int day2=sc.nextInt();
        int day3=sc.nextInt();

        DateTimeFormatter formatdate=DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.ofYearDay(year, day1);
        LocalDate date2=LocalDate.ofYearDay(year,day2);
        LocalDate date3=LocalDate.ofYearDay(year,day3);

        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);

    }
}