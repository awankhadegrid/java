import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int shipped = 0;
        int fixed = 0;
        int rejects = 0;

        for (int i = 0; i < n; i++) {
            int status = scanner.nextInt();
            if (status == 0) {
                shipped++;
            } else if (status == 1) {
                fixed++;
            } else if (status == -1) {
                rejects++;
            }
        }
        System.out.println(shipped + " " + fixed + " " + rejects);
    }
}