
import java.util.Scanner;

public class FavoriteSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) { 

            int n = sc.nextInt();
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = sc.nextInt();
            }

            int low = 0;
            int high = n-1;

            int[] result = new int[n];

            for (int idx = 0; idx < n; idx++) {
                if (idx % 2 == 0) {
                    result[idx] = a[low];
                    low++;
                }
                else{
                    result[idx] = a[high];
                    high--;
                }
            }

            for (Object elem : result) {
                System.out.print(elem + " ");
            }
            System.out.println();

            t--;
        }
    }
}