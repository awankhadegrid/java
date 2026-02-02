import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Assuming the input is an integer
        int x = scanner.nextInt();
        boolean inInterval = false;

        if ((x > -15 && x <= 12) || (x > 14 && x < 17) || (x >= 19)) {
            inInterval = true;
        }

        System.out.println(inInterval ? "True" : "False");
    }
}