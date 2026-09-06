// import java.util.*;
// public class ShashaAndArrayColor {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t > 0) { 

//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }

//             int left = 0;
//             int right = n - 1;

//             Arrays.sort(arr);
//             int sum = 0;

//             int count = 2;

//             while (left < right && count > 0) { 
//                 sum += arr[right] - arr[left];
//                 right--;
//                 left++;
//                 count--;
//             }

//             System.out.println(sum);

//             t--;
//         }
//     }
// }
import java.util.*;

public class ShashaAndArrayColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int left = 0;
            int right = n - 1;
            long sum = 0;

            while (left < right) {
                sum += arr[right] - arr[left];
                left++;
                right--;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}