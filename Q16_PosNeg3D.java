import java.util.Scanner;

public class Q16_PosNeg3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][2][2];
        int pos = 0, neg = 0;
        System.out.println("Enter 8 elements of the 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                    if (a[i][j][k] > 0) pos++;
                    else if (a[i][j][k] < 0) neg++;
                }
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
    }
}
