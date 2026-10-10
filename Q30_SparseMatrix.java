import java.util.Scanner;

public class Q30_SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int zeros = 0, nonZeros = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (sc.nextInt() == 0) zeros++;
                else nonZeros++;
            }
        System.out.println("Zero elements: " + zeros + ", Non-zero elements: " + nonZeros);
        if (zeros > nonZeros) System.out.println("The matrix is a sparse matrix.");
        else System.out.println("The matrix is NOT a sparse matrix.");
    }
}
