import java.util.Scanner;
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int arr[] = new int[n];

        int result = n;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > h) {
                result++;
            }
        }

        System.out.println(result);
    }
}
