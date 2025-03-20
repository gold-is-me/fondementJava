import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void printArray(int[] array) {
        System.out.print("Array: {");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }
    static void printArray(int[][] array) {
        System.out.print("Array: {");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.print(array[i][array[array.length-1].length - 1] + "}, ");
        }
        System.out.print("{");
        for (int i = 0; i < array[array.length - 1].length - 1; i++) {
            System.out.print(array[array.length - 1][i] + ", ");
        }
        System.out.print(array[array.length - 1][array[array.length-1].length - 1] + "}");
        System.out.println("}");
    }

    public static void main(String[] args) {
//        System.out.println("Enter the number of elements you wish to enter: ");
//        int n = sc.nextInt();
        int[][] array = new int[][]{{1, 2}, {4, 5}, {7, 8}, {9, 10}};
        printArray(array);
    }
}