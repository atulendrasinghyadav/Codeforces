import java.io.*;
import java.util.*;

public class NumberOfPairs {

    static long countPairs(int[] a, long x) {
        int n = a.length;
        int i = 0, j = n - 1;
        long count = 0;

        while (i < j) {
            if ((long) a[i] + a[j] <= x) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);

            long ans = countPairs(a, r) - countPairs(a, l - 1);
            out.append(ans).append('\n');
        }

        System.out.print(out.toString());
    }
}
