import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        if (twoDimArray == null || twoDimArray.length == 0) {
            return;
        }
        int firstRowLastCol = twoDimArray[0].length - 1;
        int lastRowIndex = twoDimArray.length - 1;
        int lastRowLastCol = twoDimArray[lastRowIndex].length - 1;

        System.out.print(twoDimArray[0][0] + " ");
        System.out.println(twoDimArray[0][firstRowLastCol] + " ");
        System.out.print(twoDimArray[lastRowIndex][0] + " ");
        System.out.print(twoDimArray[lastRowIndex][lastRowLastCol]);
    }
}