import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y;

            if (x >= -67 && x <= 67) {
                y = x;
            } else {
                y = 0;
            }

            System.out.println(y);
        }

        scanner.close();
    }
}