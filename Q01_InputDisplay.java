import java.util.Scanner;

public class Q01_InputDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("Array elements:");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
