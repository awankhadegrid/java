import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        int nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static int getNextState(int currentState) {
        if(currentState==0){
            return 1;
        } else if (currentState==1) {
            return 2;
        } else {
            return 0;
        }
    }

    public static String getAction(int currentState) {
        if(currentState==0){
            return "Change to Yellow";
        } else if (currentState==1) {
            return "Change to Green";
        } else {
            return "Change to Red";
        }
    }
}