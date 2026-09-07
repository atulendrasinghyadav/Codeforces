import java.util.*;
public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int max = 0;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > t) {
                sum -= arr[left];
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
