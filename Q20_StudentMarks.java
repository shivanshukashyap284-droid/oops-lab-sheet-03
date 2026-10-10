import java.util.Scanner;

public class Q20_StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Number of subjects for student " + (i + 1) + ": ");
            int s = sc.nextInt();
            marks[i] = new int[s];
            System.out.println("Enter " + s + " marks:");
            for (int j = 0; j < s; j++) marks[i][j] = sc.nextInt();
        }
        System.out.println("\nMarks of students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int m : marks[i]) System.out.print(m + " ");
            System.out.println();
        }
    }
}
