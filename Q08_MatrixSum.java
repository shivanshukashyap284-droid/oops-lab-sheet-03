import java.util.Scanner;

public class Q08_MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int sum = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) sum += sc.nextInt();
        System.out.println("Sum of all elements = " + sum);
    }
}
