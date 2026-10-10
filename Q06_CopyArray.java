import java.util.Scanner;

public class Q06_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] source = new int[n];
        int[] target = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) source[i] = sc.nextInt();
        for (int i = 0; i < n; i++) target[i] = source[i];
        System.out.print("Copied array: ");
        for (int x : target) System.out.print(x + " ");
        System.out.println();
    }
}
