import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups=scanner.nextInt();
        boolean weekdays=scanner.nextBoolean();
        boolean ans=false;
        if(weekdays){
            if(cups >= 15 && cups <= 25){
                ans = true;
            }
        }
        else {
            if(cups >= 10 && cups <= 20){
                ans = true;
            }
        }
        System.out.println(ans);
    }
}