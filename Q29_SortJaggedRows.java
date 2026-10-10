import java.util.Scanner;

public class Q29_SortJaggedRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int[][] jag = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Length of row " + (i + 1) + ": ");
            jag[i] = new int[sc.nextInt()];
            System.out.println("Enter " + jag[i].length + " elements:");
            for (int j = 0; j < jag[i].length; j++) jag[i][j] = sc.nextInt();
        }
        // bubble sort each row
        for (int[] row : jag)
            for (int p = 0; p < row.length - 1; p++)
                for (int q = 0; q < row.length - 1 - p; q++)
                    if (row[q] > row[q + 1]) {
                        int t = row[q];
                        row[q] = row[q + 1];
                        row[q + 1] = t;
                    }
        System.out.println("Jagged array with sorted rows:");
        for (int[] row : jag) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
