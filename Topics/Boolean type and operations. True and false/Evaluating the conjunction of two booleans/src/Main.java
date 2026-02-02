import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object to read the input
        Scanner in = new Scanner(System.in);

        // Read two boolean inputs
        boolean bool1 = in.nextBoolean();
        boolean bool2 = in.nextBoolean();
        boolean ans=bool1 && bool2;
        System.out.println(ans);
        in.close();
    }
}