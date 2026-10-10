public class Q19_JaggedArray {
    public static void main(String[] args) {
        int[][] jag = new int[3][];
        jag[0] = new int[2];
        jag[1] = new int[4];
        jag[2] = new int[3];
        int value = 1;
        for (int i = 0; i < jag.length; i++)
            for (int j = 0; j < jag[i].length; j++) jag[i][j] = value++;
        System.out.println("Jagged array:");
        for (int i = 0; i < jag.length; i++) {
            System.out.print("Row " + i + " (length " + jag[i].length + "): ");
            for (int j = 0; j < jag[i].length; j++) System.out.print(jag[i][j] + " ");
            System.out.println();
        }
    }
}
