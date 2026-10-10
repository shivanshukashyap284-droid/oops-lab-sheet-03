import java.util.Scanner;

public class Q24_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] unique = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++)
                if (unique[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            if (!duplicate) unique[size++] = arr[i];
        }
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < size; i++) System.out.print(unique[i] + " ");
        System.out.println();
    }
}
