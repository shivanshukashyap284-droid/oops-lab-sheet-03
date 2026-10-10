import java.util.Scanner;

public class Q11_Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        int[][] t = new int[c][r];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                t[j][i] = m[i][j];
            }
        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) System.out.print(t[i][j] + "\t");
            System.out.println();
        }
    }
}
