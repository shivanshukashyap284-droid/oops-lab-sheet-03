import java.util.Scanner;

public class Q21_RotateLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) arr[i] = arr[i + 1];
        arr[n - 1] = first;
        System.out.print("Array after left rotation: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
