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

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);

        System.out.println("entrez 3 mots");
        String mot1 = sc.next();
        String mot2 = sc.next();
        String mot3 = sc.next();
        System.out.println(mot1);
        System.out.println(mot2);
        System.out.println(mot3);
    }
}