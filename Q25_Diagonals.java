import java.util.Scanner;

public class Q25_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) m[i][j] = sc.nextInt();
        int main = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            main += m[i][i];
            secondary += m[i][n - 1 - i];
        }
        System.out.println("Sum of main diagonal      = " + main);
        System.out.println("Sum of secondary diagonal = " + secondary);
    }
}
