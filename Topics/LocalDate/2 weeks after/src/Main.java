import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputdate=sc.next();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate id=LocalDate.parse(inputdate,df);
        LocalDate result=id.plusDays(14);
        String finaldate=result.format(df);
        System.out.println(finaldate);


    }
}