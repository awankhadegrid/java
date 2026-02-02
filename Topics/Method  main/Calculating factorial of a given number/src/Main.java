import java.util.Scanner; // 3.1 Import necessary library

public class Main { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact *i;
        }
        System.out.println(fact);

        scanner.close(); // Always close the scanner when done
    }

}