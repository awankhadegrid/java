import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0;
        int currentTemp;
        while(scanner.hasNextInt()){
            currentTemp = scanner.nextInt();
            if(currentTemp >= 100){
                break;
            }
            if(currentTemp>maxTemperature){
                maxTemperature=currentTemp;
            }
        }
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}