
import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = 0;
        int size = m * n;
        if (size % 2 == 0) {
            result = size / 2;
        }
        else{
            result = (size - 1) / 2;
        }

        System.out.println(result);
    }
}
