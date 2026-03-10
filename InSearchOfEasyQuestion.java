import java.util.Scanner;
public class InSearchOfEasyQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Hard");
        }
        else{
            System.out.println("Easy");
        }
    }
}
