// import java.util.*;
// public class Fence{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int h = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int sum = 0;
//         for (int i = 0; i < h; i++) {
//             sum += arr[i];
//         }

//         int minSum = sum;
//         int minLeft = 0;
//         for (int i = h; i < n; i++) {
//             sum += arr[i];
//             sum -= arr[i-h];
//             int left = i - h + 1; 
//             if (sum < minSum) {
//                 minSum = 0;
//                 minLeft = left;
//             }
//         }
//         System.out.println(minLeft + 1);
//     }
// }

import java.util.*;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int minSum = sum;
        int minLeft = 0;

        // Slide the window
        for (int right = k; right < n; right++) {
            sum += arr[right];
            sum -= arr[right - k];

            int left = right - k + 1;

            if (sum < minSum) {
                minSum = sum;
                minLeft = left;
            }
        }

        // Convert to 1-based index
        System.out.println(minLeft + 1);
    }
}