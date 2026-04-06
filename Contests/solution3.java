import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] permutation = new int[3 * n];

            // Fill the permutation with numbers from 1 to 3n
            for (int j = 0; j < 3 * n; j++) {
                permutation[j] = j + 1;
            }

            // Output the permutation in the required order
            for (int j = 0; j < n; j++) {
                System.out.print(permutation[2 * j + 1] + " "); // Print the median of each block
                System.out.print(permutation[2 * j] + " ");     // Print the first element of each block
                System.out.print(permutation[2 * j + 2] + " "); // Print the last element of each block
            }
            System.out.println();
        }

        scanner.close();
    }
}
