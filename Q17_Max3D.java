import java.util.Scanner;

public class Q17_Max3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][2][2];
        System.out.println("Enter 8 elements of the 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) a[i][j][k] = sc.nextInt();
        int max = a[0][0][0];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] > max) max = a[i][j][k];
        System.out.println("Maximum element = " + max);
    }
}
