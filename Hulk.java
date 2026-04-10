import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder resultString = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i != n) {
                resultString.append("I love that ");
            } else if (i % 2 != 0 && i != n) {
                resultString.append("I hate that ");
            }
            if (i == n && i % 2 == 0) {
                resultString.append("I love it");
            } else if (i == n && i % 2 != 0) {
                resultString.append("I hate it");
            }
        }
        System.out.println(resultString.toString());
    }
}
