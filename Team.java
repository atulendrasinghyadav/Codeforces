import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        while (t > 0) { 

            int arr[] = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            int tempSum = 0;

            for (int num : arr) {
                tempSum += num;
                if (tempSum >= 2) {
                    ans++;
                    break;
                }
            }
            t--;
        }
        System.out.println(ans);
    }
}
