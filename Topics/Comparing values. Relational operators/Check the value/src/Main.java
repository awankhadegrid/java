import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean ans = false;
        if(num < 10){
            ans = true;
        }
        System.out.println(ans);
    }
}