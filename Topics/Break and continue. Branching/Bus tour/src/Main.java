import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int num=scanner.nextInt();
        int currentBridge;
        int count=0;
        boolean ans=false;
        while (scanner.hasNextInt()){

            currentBridge = scanner.nextInt();
            count++;
            if(currentBridge<=height){
                System.out.println("Will crash on bridge " + count);
                ans=true;
                break;
            }

        }
        if(!ans){
            System.out.println("Will not crash");
        }

    }
}