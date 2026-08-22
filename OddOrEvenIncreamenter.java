
import java.util.Scanner;

public class OddOrEvenIncreamenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) { 

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int idx = 0; idx < arr.length; idx++) {
                arr[idx] = sc.nextInt();
            }

            int evenRemainder = arr[0] % 2;
            int oddRemainder = arr[1] % 2;
            boolean flag = true;

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    if (arr[i] % 2 != evenRemainder) {
                        flag = false;
                        System.out.println("NO");
                        break;
                    }
                }
                else{
                    if (arr[i] % 2 != oddRemainder) {
                        flag = false;
                        System.out.println("NO");
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println("YES");
            }


            t--;
        }
    }
}
