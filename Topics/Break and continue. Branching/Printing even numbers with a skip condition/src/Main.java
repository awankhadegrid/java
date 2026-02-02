import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the integer 'n' as input from user
        int n = sc.nextInt();

        // Loop from 1 to 'n' to print the numbers
        for(int i = 1; i <= n; i++) {
            if(i==10){
                i=i+5;
                continue;
            }
            if(i%2==0){
                System.out.print(i+" ");
            }

        }

        sc.close();
    }
}